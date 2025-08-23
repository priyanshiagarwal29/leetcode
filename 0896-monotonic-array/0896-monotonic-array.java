class Solution {
    public boolean isMonotonic(int[] nums) {
        int d=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) {
            d=(d==-1)?1:d;
            if(d !=1) return false;
            }
           else if(nums[i]<nums[i-1]){
            d=(d==-1)?0:d;
            if(d!=0) return false;
                       }

        }
          return true;
        }
}
      
    