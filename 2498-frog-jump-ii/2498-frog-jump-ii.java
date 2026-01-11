class Solution {
    public int maxJump(int[] stones) {
        int n=stones.length,ans=0;
        if(n==2) return stones[1]-stones[0];
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,stones[i+1]-stones[i]);
        }
        for(int i=0;i<n-2;i++) ans=Math.max(ans,stones[i+2]-stones[i]);
        return ans;
    }
}