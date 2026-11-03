class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;

        int min=nums[0];
        int max=nums[n];

        int minres=0;
        

        for(int i=0;i<n;i++){
            minres+=max-nums[i];
            
        }
        return minres;
    }
}