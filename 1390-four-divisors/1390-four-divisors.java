class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    set.add(j);
                    set.add(num / j);
                }
            }

            if (set.size() == 4) {
                for (int x : set) {
                    ans += x;
                }
            }
        }
        return ans;
    }
}
