class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                max=Math.max(max,matrix[j][i]);
            }
            for(int j=0;j<m;j++){
                if(matrix[j][i]==-1) ans[j][i]=max;
                else ans[j][i]=matrix[j][i];
            }
        }
        return ans;
    }
}