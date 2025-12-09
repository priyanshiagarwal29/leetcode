class Solution {
    public int specialTriplets(int[] nums) {
        int n=100001,mod=100000007;
        int ans=0;
        int[] freq=new int[n];
        int[] prev=new int[n];
        for(int num:nums) freq[num]++;
        for(int i = 1; i < nums.length - 1; i++) {
            prev[nums[i - 1]]++;
            int j = nums[i], k = 2*j;
            if(k < n) {
                ans += prev[k] * (freq[k] - prev[k] - (j == 0 ? 1 : 0));
            }
        }
        return (ans % mod);

    }
}