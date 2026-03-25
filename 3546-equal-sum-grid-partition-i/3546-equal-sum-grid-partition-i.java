class Solution {

    // ✅ Vertical cut (column-wise)
    public boolean ver(int[][] grid, int m, int n, long tar) {
        long sum = 0;
        for (int j = 0; j < n - 1; j++) {     // columns
            for (int i = 0; i < m; i++) {     // rows
                sum += grid[i][j];
            }
            if (sum == tar) return true;
        }
        return false;
    }

    // ✅ Horizontal cut (row-wise)
    public boolean hor(int[][] grid, int m, int n, long tar) {
        long sum = 0;
        for (int i = 0; i < m - 1; i++) {     // rows
            for (int j = 0; j < n; j++) {     // columns
                sum += grid[i][j];
            }
            if (sum == tar) return true;
        }
        return false;
    }

    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long total = 0;
        for (int[] row : grid) {
            for (int x : row) total += x;
        }

        if (total % 2 != 0) return false;

        long target = total / 2;

        return ver(grid, m, n, target) || hor(grid, m, n, target);
    }
}