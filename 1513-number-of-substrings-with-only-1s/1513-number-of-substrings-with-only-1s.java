class Solution {
    public int numSub(String s) {
        int c=0,ans=0,mod=1000000007;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1') c++;
        else c=0;
        ans=(ans+c)%mod;
       }
       return ans;
    }
}