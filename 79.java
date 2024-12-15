class Solution {
        private boolean searchword(char[][] board, int row, int col, String word, int idx) {
        
        if (idx == word.length()) {
            return true;
        }

        
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(idx)) {
            return false;
        }

        // Temporarily mark the current cell as visited by modifying the board value
        char temp = board[row][col];
        board[row][col] = '#'; // Using '#' as a marker to indicate the cell is visited

        // Explore all four directions: up, down, left, right
        boolean found = searchword(board, row - 1, col, word, idx + 1) ||  // Up
                        searchword(board, row + 1, col, word, idx + 1) ||  // Down
                        searchword(board, row, col - 1, word, idx + 1) ||  // Left
                        searchword(board, row, col + 1, word, idx + 1);    // Right

        // Restore the cell to its original state after backtracking
        board[row][col] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        boolean flag=false;
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(searchword(board,i,j,word,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}
