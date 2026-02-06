class Solution {
    // int dp[][];
    // public int remove(int[] nums,int k,int i,int j){
    //     if(i>=j) return 0;
    //     if(nums[i]*k>=nums[j]) return 0;
    //     if (dp[i][j] != -1) return dp[i][j];

    //     //front
    //     int front=1+remove(nums,k,i+1,j);
    //     int back=1+remove(nums,k,i,j-1);
    //     return  dp[i][j] = Math.min(front, back);
    // }
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return 0;
        Arrays.sort(nums);
        // dp = new int[n][n];
        // for (int[] row : dp) Arrays.fill(row, -1);
        // return remove(nums,k,0,n-1);
    
        int i = 0, maxLen = 1;

        for (int j = 0; j < n; j++) {
            while ((long) nums[j] > (long) nums[i] * k) {
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return n - maxLen;

    }
}