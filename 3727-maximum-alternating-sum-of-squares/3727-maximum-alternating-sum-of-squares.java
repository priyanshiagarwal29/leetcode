class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] a = new long[nums.length];

        for (int i = 0; i < nums.length; i++)
            a[i] = (long) nums[i] * nums[i];

        Arrays.sort(a);
        int k = nums.length / 2;   
        long res=0;
        for (int i = 0; i < k; i++)
            res -= a[i];
        
        for (int i = k; i < nums.length; i++)
            res += a[i];

        return res;
    }
}