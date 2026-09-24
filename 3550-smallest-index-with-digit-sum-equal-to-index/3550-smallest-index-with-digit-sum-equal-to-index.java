class Solution {
    public int smallestIndex(int[] nums) {
        int ans=-1;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            int x=nums[i];
            while(x>0){
                int d=x%10;
                sum+=d;
                x=x/10;
            }
            if(sum==i) return i;
        }
        return ans;
    }
}