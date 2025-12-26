class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0;
        int h = 0;

        for (int n : candies) {
            total += n;          
            h = Math.max(h, n);
        }

        if (total < k) return 0;

        int l = 1, ans = 0;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            long c = 0;          

            for (int cn : candies) {
                c += cn / mid;
            }

            if (c >= k) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}
