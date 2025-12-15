class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=1,c=1;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]==prices[i+1]+1)c++;
            else c=1;
            ans+=c;
        }
        return ans;
    }
}