class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int i=0,j=0;

        int ans=0;
         
         while(i<n && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
            }
         }
         return ans;
    }
}