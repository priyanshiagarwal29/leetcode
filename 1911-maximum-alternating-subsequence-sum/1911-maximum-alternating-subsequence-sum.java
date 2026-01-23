class Solution {
    // public long solve(int[] nums,int i,boolean iseven){
    //     if(i==nums.length) return 0;
    //     //take
    //     long skip=solve(nums,i+1,iseven);
    //     int val=nums[i];
    //     if(iseven==false) val=-val;
    //     long take=val+solve(nums,i+1,!iseven);
    //     return Math.max(skip,take);
        
    // }
    // public long solve(int[]nums,long[][] dp,int i,int iseven){
    //   if(i==nums.length) return 0;
    //   if(dp[i][iseven] !=-1) return dp[i][iseven];
    //   long skip=solve(nums,dp,i+1,iseven);
    //     int val=nums[i];
    //     if(iseven==0) val=-val;
    //     long take=val+solve(nums,dp,i+1,1-iseven);
    //     return dp[i][iseven]=Math.max(take,skip);
       
    // }
    
    public long maxAlternatingSum(int[] nums) {
    //    return solve(nums,0,true);
     long[][] dp=new long[nums.length+1][2];
    //  for(long[] row:dp) Arrays.fill(row,-1);
       int i;
     for(i=1;i<=nums.length;i++){
        dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]-nums[i-1]);
        dp[i][1]=Math.max(dp[i-1][0]+nums[i-1],dp[i-1][1]);
     }
    //  return solve(nums,dp,0,1);
    return Math.max(dp[nums.length][0],dp[nums.length][1]);
    }
}