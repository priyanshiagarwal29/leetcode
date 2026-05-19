class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) return nums1[i];
            else{
                  if(i+1<nums1.length && (nums1[i]==nums1[i+1] || nums2[j]>=nums1[i])){
                    i++;
                  }
                  else if(j+1<nums2.length && (nums2[j]==nums2[j+1] || nums2[j]<=nums1[i] )){
                    j++;
                  }
                else{
                    i++;
                    j++;
                }
            }
        }
        return -1;

    }
}