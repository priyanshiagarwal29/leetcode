class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,ans=Integer.MIN_VALUE,maxp=nums[0],minp=nums[0];
        if(n==1) return nums[0];
        for(int i=1;i<n;i++){
           if(nums[i]<0){
            int temp=minp;
            minp=maxp;
            maxp=temp;
           }
           maxp=Math.max(nums[i],maxp*nums[i]);
           minp =Math.min(nums[i],minp*nums[i]);
           ans=Math.max(ans,maxp);

        }
        return ans;
    }
}