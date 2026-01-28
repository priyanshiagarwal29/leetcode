class Solution {
    public int solve(int[][] mat,int r,int c,int prev,int[][] dp){
        if(r>=mat.length || c>=mat[0].length || r<0 || c<0 || mat[r][c]<=prev) return 0;
        if(dp[r][c] !=-1) return dp[r][c];
        return dp[r][c]=1+Math.max(Math.max(solve(mat,r+1,c,mat[r][c],dp),solve(mat,r,c+1,mat[r][c],dp)),Math.max(solve(mat,r-1,c,mat[r][c],dp),solve(mat,r,c-1,mat[r][c],dp)));
    }
    public int longestIncreasingPath(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] dp=new int[r][c];
        for(int[] d:dp) Arrays.fill(d,-1);
        int ans=0;
        for(int i=0;i<r;i++)
         {       
         for(int j=0;j<c;j++)
      { 
        ans=Math.max(ans,solve(matrix,i,j,-1,dp));
      }
    }
    return ans;
    }
}