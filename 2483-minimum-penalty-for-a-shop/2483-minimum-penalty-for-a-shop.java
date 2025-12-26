class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] pre=new int[n+1];
        int[] suf=new int[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1];
            if(customers.charAt(i-1)=='N') pre[i]++;
        }
        for(int i=n-1;i>=0;i--){
            suf[i]=suf[i+1];
            if(customers.charAt(i)=='Y') suf[i]++;
        }
        int ans=Integer.MAX_VALUE,ans1=-1;
        for(int i=0;i<=n;i++){
            int t=pre[i]+suf[i];
            if(t<ans){
                ans=Math.min(t,ans);
                ans1=i;
            }
        }
        return ans1;

    }
}