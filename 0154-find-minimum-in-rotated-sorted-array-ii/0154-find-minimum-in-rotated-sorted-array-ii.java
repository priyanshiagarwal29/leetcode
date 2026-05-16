class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[l]==nums[mid] && nums[mid]==nums[r]){
               l++;
               r--;
            }
            else if(nums[r]<nums[mid]){
             l=mid+1;
            }
            else r=mid;
        }
        return nums[l];
    }
}