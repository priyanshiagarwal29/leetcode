class Solution {
    public boolean solve(char[][] board,char num,int row,int col){
        //for same row
       
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]==num) return false;
        }
        //for same col
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num)return false;
        }
        //for the box
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='.') continue;
            char num=board[i][j];
            board[i][j]='.';
            if(!solve(board,num,i,j)) return false;
            board[i][j] = num; 
        }
       
       }
        return true;

    }
}