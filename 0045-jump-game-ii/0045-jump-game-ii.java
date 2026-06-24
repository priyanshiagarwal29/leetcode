class Solution {
    int[] dp;
    public int jumpsNeeded(int[] nums,int curr){
        if(curr==nums.length-1) return 0;
          
           if(dp[curr] !=Integer.MAX_VALUE) return dp[curr];
        int ans=Integer.MAX_VALUE;

        for(int i=curr+1;i<=curr+nums[curr] && i<nums.length;i++){
            // if(nums[i]==0) continue;

            int res=jumpsNeeded(nums,i);

            if(res!=Integer.MAX_VALUE){
                ans=Math.min(ans,1+res);
            }
        }
        return dp[curr]= ans;
    }
    public int jump(int[] nums) {
        int n=nums.length;
        
      dp=new int[n];
      Arrays.fill(dp,Integer.MAX_VALUE);

       return(jumpsNeeded(nums,0));

    }
}