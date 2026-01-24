class Solution {
    // recurrsion
    // public int solve(int[] nums,int i,int prev){
    //     if(i==nums.length) return 0;
    //     int curr=nums[i];
    //     //take
    //     int take=0;
    //     if(curr>prev)
    //     take=1+solve(nums,i+1,curr);

    //     int skip=solve(nums,i+1,prev);
    //     return Math.max(skip,take);

    // }
    // public int longest(int[] nums,int i,int prev,int[][] dp){
    //     if(i>=nums.length) return 0;
    //     if(prev !=-1 && dp[i][prev] !=-1) return dp[i][prev];
    //     int take=0;
    //     if(prev==-1 || nums[i]>nums[prev]) 
    //     take=1+longest(nums,i+1,i,dp);

    //     int not_take=longest(nums,i+1,prev,dp);
    //     if(prev !=-1)
    //     dp[i][prev]=Math.max(take,not_take);
    //     return Math.max(take,not_take);
    // }

    public int lengthOfLIS(int[] nums) {
        // int[][] dp=new int[nums.length+1][nums.length+1];
        // for(int i=0;i<=nums.length;i++){
        //     for(int j=0;j<=nums.length;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // return longest(nums,0,-1,dp);
        // return solve(nums,0,-1);
        int n=nums.length;
        int[] dp=new int[n];
        int ans=0;
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1); 
                }
            }
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}