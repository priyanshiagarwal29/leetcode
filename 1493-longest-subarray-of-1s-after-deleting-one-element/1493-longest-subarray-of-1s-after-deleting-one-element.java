class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,ans=0,k=0;
        while(j<nums.length){
            if(nums[j]==0) 
             k++;
            while(k>1){
                if(nums[i]==0)
                k--;
                i++;
            }
          ans=Math.max(ans,j-i);
          j++;
        }
        return ans;
    }
}