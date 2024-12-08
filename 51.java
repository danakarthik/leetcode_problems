class Solution {
    private List<String> construct(char[][] board)
    {
        List<String>res=new ArrayList();
          
            for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
            return res;

    }
    private void findnqueen(int col,int n,List<List<String>>ans,char[][] board,int[] leftrow, int[] lowerdiagonal,int[] upperdiagonal)
    {
        if(col==board.length)
        {
            ans.add(construct(board));
            return ;
        }
        for(int row=0;row<n;row++)
        {
            if(leftrow[row]==0&& lowerdiagonal[row+col]==0&&upperdiagonal[n-1 + col-row]==0)
            {
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[n-1+col-row]=1;
                findnqueen(col+1,n,ans,board,leftrow,lowerdiagonal,upperdiagonal);
                board[row][col]='.';
                leftrow[row]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[n-1+col-row]=0;
            }

        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>>ans=new ArrayList();
        int[] column=new int[n];
        int[] lowerdiagonal=new int[2*n-1];
        int[] upperdiagonal=new int[2*n-1];
        findnqueen(0,n,ans,board,column,lowerdiagonal,upperdiagonal);
        return ans;
  
    }
}
