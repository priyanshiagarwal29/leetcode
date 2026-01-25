class Solution {
    int N,M,K;
    int MOD=1000000007;
    public int solve(int idx,int cost,int mx,int[][][] dp){
        if(cost>K) return 0;
        if(idx==N){
            if(cost==K) return 1;
           return 0;
        }
        if(dp[idx][cost][mx] !=-1) return dp[idx][cost][mx];
        int res=0;
        for(int i=1;i<=M;i++){
            if(i>mx) 
            res=(res+solve(idx+1,cost+1,i,dp))%MOD;
            else{
                res=(res+solve(idx+1,cost,mx,dp))%MOD;
            }
        }
        return dp[idx][cost][mx]= res;
    }
    public int numOfArrays(int n, int m, int k) {
        N=n;
        M=m;
        K=k;
        int[][][] dp=new int[n+1][k+1][m+1];
        for(int[][] row:dp){
            for(int[] col:row){
                Arrays.fill(col,-1);
            }
        }
        return solve(0,0,0,dp);
    }
}