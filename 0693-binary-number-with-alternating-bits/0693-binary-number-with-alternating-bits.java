class Solution {
    public boolean hasAlternatingBits(int n) {
       int lsb=n&1;
       while(n>0){
       n=n>>1;
       int b=n&1;
       if(lsb==b) return false;
       lsb=b;
       }
       return true;
    }
}