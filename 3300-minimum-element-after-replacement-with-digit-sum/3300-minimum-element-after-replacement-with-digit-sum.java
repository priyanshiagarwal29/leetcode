class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;

        for(int n:nums){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum+=d;
                n=n/10;
            }
            ans=Math.min(ans,sum);
        }
        return ans;

    }
}