class Solution {
    public boolean isSafe(char[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(board[i][j]=='Q' ) return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q' ) return false;
        }
          return true;
        }
    
    public int solve(char[][] board,int row){
        if(row==board.length) return 1;
        int c=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                c+=solve(board,row+1);
                board[row][col]='.';
            }
        }
        return c;
    }
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        } 
        return solve(board,0);
    }
}