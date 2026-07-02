class Solution {
    public int subset(int[] nums,int i,int curr){
        if(i==nums.length) return curr;

        int took=subset(nums,i+1,curr^nums[i]);

        int skip=subset(nums,i+1,curr);

        return took+skip;
    }
    public int subsetXORSum(int[] nums) {
        return subset(nums,0,0);
    }
}