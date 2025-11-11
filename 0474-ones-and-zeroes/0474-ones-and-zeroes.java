class Solution {
    public int helper(String[] strs,int m,int n,int i,int[][][] dp){
        if(i>=strs.length) return 0;
        if(dp[m][n][i] != -1) return dp[m][n][i];
        String s=strs[i];
        int zero=0,one=0;
        for(int k=0;k<s.length();k++){
            char c=s.charAt(k);
            if(c=='0') zero++;
            else one++;
        }
        
        int takes=0;
        if(zero<=m && one<=n)
        takes=1+helper(strs,m-zero,n-one,i+1,dp);  
        int skip=helper(strs,m,n,i+1,dp);
        return dp[m][n][i]= Math.max(takes,skip);
    }    
        
    
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp=new int[m+1][n+1][strs.length+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return helper(strs,m,n,0,dp);
    }
}