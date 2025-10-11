class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        if(n==2) return 2;
        int max=2,i=0,j=2;
        while(j<n && i<n){
            int c=0;
            while(j<n && nums[j]==nums[j-1]+nums[j-2]){
                j++;
            }
            
            c=j-i;
            max=Math.max(max,c);
            i=j-1;
            j++;
            
        }
        
        return max;
    }
}