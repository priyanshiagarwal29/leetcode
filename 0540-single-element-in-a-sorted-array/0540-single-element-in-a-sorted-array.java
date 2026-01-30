class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        int n=nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid %2!=0)mid--;
            if(nums[mid]==nums[mid+1])low=mid+2;
            else high=mid-2;
        }
        return nums[low];
    }
}