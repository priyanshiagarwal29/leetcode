class Solution {
    int m,n;
    int[][] dp;
    public int solve(int i,int j,int[][] obstacleGrid){
        if(i >= m || j >= n) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        if(i == m-1 && j == n-1) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        
        return dp[i][j] = solve(i+1,j,obstacleGrid)+solve(i,j+1,obstacleGrid);
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        
        dp = new int[m][n];
        
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        
        return solve(0,0,obstacleGrid);
    }
}