class Solution {
    public int countTriples(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int c_sq=i*i +j*j;
                int c=(int) Math.sqrt(c_sq);
                if(c*c==c_sq && c<=n) ans++;
            }
        }
        return ans;
    }
}