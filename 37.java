class Solution {
    private boolean isvalidate(char[][] board, int row , int col,char c)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==c)return false;
            if(board[i][col]==c)return false;
            if(board[3*(row/3) + i/3][3*(col/3) + i%3]==c)return false;
        }
        return true;
    }
    private boolean solvingsuduko(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char k='1';k<='9';k++)
                    {
                        if(isvalidate(board,i,j,k))
                        {
                            board[i][j]=k;
                            if(solvingsuduko(board)==true)
                            return true;
                            else board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }
    public void solveSudoku(char[][] board) {
       solvingsuduko(board);
    }
}
