class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int curr=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(j==k || i==k ) continue;
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                    curr=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                     ans=Math.min(ans,curr);

                    }
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}