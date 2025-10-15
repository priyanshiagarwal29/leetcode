class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n =nums.size();
        if(n==0) return 0;
        if(n==1) return 1;
        int l=1,ans=0,prev=0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)) l++;
            else{
                ans=Math.max(ans,l/2);
                ans=Math.max(ans,Math.min(prev,l));
                prev=l;
                l=1;
            }
        }
      ans=Math.max(ans,l/2);
      ans=Math.max(ans,Math.min(prev,l));
      return ans;
    }
}