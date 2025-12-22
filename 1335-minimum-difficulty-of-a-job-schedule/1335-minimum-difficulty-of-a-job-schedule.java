class Solution {

    public void solve(int[] jobDifficulty, int days, int ind, int[][] memo) {

        if (memo[days][ind] != -1) return;

        if (days == 1) {
            int num = 0;
            for (int i = ind; i < jobDifficulty.length; i++) {
                num = Math.max(num, jobDifficulty[i]);
            }
            memo[days][ind] = num;
            return;
        }

        int ans = Integer.MAX_VALUE;
        int currmax = 0;

        for (int j = ind; j <= jobDifficulty.length - days; j++) {
            currmax = Math.max(currmax, jobDifficulty[j]);

            if (memo[days - 1][j + 1] == -1) {
                solve(jobDifficulty, days - 1, j + 1, memo);
            }

            ans = Math.min(ans, currmax + memo[days - 1][j + 1]);
        }

        memo[days][ind] = ans;
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (d > jobDifficulty.length) return -1;

        int[][] memo = new int[d + 1][jobDifficulty.length];
        for (int i = 0; i <= d; i++) {
            Arrays.fill(memo[i], -1);
        }

        solve(jobDifficulty, d, 0, memo);
        return memo[d][0];
    }
}
