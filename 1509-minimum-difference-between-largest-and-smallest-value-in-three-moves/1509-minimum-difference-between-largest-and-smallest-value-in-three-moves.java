class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<=4) return 0;
        int a1=nums[n-4]-nums[0];
        int a2=nums[n-1]-nums[3];
        int a3=nums[n-2]-nums[2];
        int a4=nums[n-3]-nums[1];
       return Math.min(a1,Math.min(a2,Math.min(a3,a4)));
    }
}