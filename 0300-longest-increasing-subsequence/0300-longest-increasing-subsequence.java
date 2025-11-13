class Solution {
    // recurrsion
    public int longest(int[] nums,int curr,int prev,int[][] dp){
        if(curr>=nums.length) return 0;
        if(dp[curr][prev+1] !=-1) return dp[curr][prev+1];
        int take=0;
        if(prev==-1 || nums[curr]>nums[prev]) 
        take=1+longest(nums,curr+1,curr,dp);

        int not_take=longest(nums,curr+1,prev,dp);
        return dp[curr][prev+1]= Math.max(take,not_take);
    }
   

    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=nums.length;j++){
                dp[i][j]=-1;
            }
        }
        return longest(nums,0,-1,dp);
        // return dp[nums.length-1][nums.length];
    }
}