class Solution {
    public int cal(int i,int j,int[][] memo,int m,int n){
        if(i==m-1 && j==n-1) return 1;
        if(i>=m || j>=n) return 0;
        if(memo[i][j] !=-1) return memo[i][j];
        int down=cal(i+1,j,memo,m,n);
        int right=cal(i,j+1,memo,m,n);
        return memo[i][j]=down+right;
    }
    public int uniquePaths(int m, int n) {
        int[][] memo=new int[m][n];
        for(int[] row:memo){
            Arrays.fill(row,-1);
        }
     
     return cal(0,0,memo,m,n);
    }
}