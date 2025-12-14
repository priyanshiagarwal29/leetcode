class Solution {
    int mod=1000000007;
    public int numberOfWays(String corridor) {
        int c=0;
        for(char ch : corridor.toCharArray()) if(ch=='S') c++;
        if(c==0 || c%2 !=0) return 0;
        c=0;
        long ans=1;
        int i=0,p=0;
        boolean flag=false;
        while(i<corridor.length()){
            if(corridor.charAt(i) =='S'){
                c++;
                if(c%2==0){
                    flag=true;
                }
                else if(c>2){
                    ans=(ans*(p+1))%mod;
                    c=1;
                    flag=false;
                    p=0;
                }
            }
            else if(flag) p++;
            i++;
        }
        return (int)ans;
    }
}