class Solution {
    int[] dp;
    public int jump(int[] nums) {
        int n=nums.length;
        
      dp=new int[n];
      Arrays.fill(dp,Integer.MAX_VALUE);
      dp[n-1]=0;

      for(int curr=n-2;curr>=0;curr--){
        int ans=Integer.MAX_VALUE;
          for(int i=curr+1;i<=curr+nums[curr] && i<nums.length;i++){
         
            int res=dp[i];
          
            if(res!=Integer.MAX_VALUE){
                ans=Math.min(ans,1+res);
            }
        }
            dp[curr]=ans;
      }

       return (dp[0]);

    }
}