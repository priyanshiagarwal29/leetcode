class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int s=0,e=n-1;

        //first
        int a1=-1;
        while(s<=e){
         int mid=s+(e-s)/2;
         if(nums[mid]==target){
            a1=mid;
            e=mid-1;
         }
         else if(nums[mid]>target) e=mid-1;
         else{
            s=mid+1;
         }
        }

        int a2=-1;
        s=0;e=n-1;
        //last
        while(s<=e){
         int mid=s+(e-s)/2;
         if(nums[mid]==target){
            a2=mid;
            s=mid+1;
         }
         else if(nums[mid]>target) e=mid-1;
         else{
            s=mid+1;
         }
        }
       return new int[]{a1,a2};
    }
}