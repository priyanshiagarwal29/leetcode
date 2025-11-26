class Solution {
    private static final int MOD = 1000000007;

    public int paths(int[][] grid, int i, int j, int sum, int k, int[][][] memo) {

        if (i >= grid.length || j >= grid[0].length)
            return 0;

        if (i == grid.length - 1 && j == grid[0].length - 1)
            return ((sum + grid[i][j]) % k == 0) ? 1 : 0;

        int rem = sum % k;

        if (memo[i][j][rem] != -1)
            return memo[i][j][rem];

        int down = paths(grid, i + 1, j, sum + grid[i][j], k, memo);
        int right = paths(grid, i, j + 1, sum + grid[i][j], k, memo);

        return memo[i][j][rem] = (int)(((long)down + right) % MOD);
    }

    public int numberOfPaths(int[][] grid, int k) {

        int m = grid.length, n = grid[0].length;

        int[][][] memo = new int[m][n][k];

        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                Arrays.fill(memo[x][y], -1);

        return paths(grid, 0, 0, 0, k, memo);
    }
}
