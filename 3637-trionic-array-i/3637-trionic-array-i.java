class Solution {
    public boolean isTrionic(int[] nums) {
        int i=1;
        boolean incr=true;
        int c=0;
        if(nums.length<3) return false;
        if(nums[0]>nums[1]) return false;
        while(i<nums.length){
            if(c>2) return false;
            if(incr){
                if(nums[i]>nums[i-1])  i++;  
              
              else{
                c++;
                incr=!incr;
              }
        }
        else{
            if(nums[i]<nums[i-1]) i++;
            else{
                c++;
                incr=!incr;
            }
        }
    }
    return c==2;
}
}