class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        final int MOD = 12345;
        int m=grid.length;
        int n=grid[0].length;
        int[][] pre=new int[m][n];
        int[][] suf=new int[m][n];
        long suff=1;
        long pref=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                suf[i][j]=(int)suff;
                suff=(suff*grid[i][j])%MOD;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                pre[i][j]=(int)pref;
                pref=(pref*grid[i][j])%MOD;
            }
        }
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=(pre[i][j]*suf[i][j])%MOD;
            }
        }

        return ans;

    }
}