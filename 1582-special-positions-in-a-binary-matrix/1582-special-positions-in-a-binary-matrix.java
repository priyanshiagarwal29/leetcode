class Solution {

    public boolean check(int[][] mat, int i, int j){

        // check row
        for(int col = 0; col < mat[0].length; col++){
            if(col != j && mat[i][col] == 1)
                return false;
        }

        // check column
        for(int row = 0; row < mat.length; row++){
            if(row != i && mat[row][j] == 1)
                return false;
        }

        return true;
    }

    public int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1 && check(mat,i,j)){
                    count++;
                }
            }
        }

        return count;
    }
}