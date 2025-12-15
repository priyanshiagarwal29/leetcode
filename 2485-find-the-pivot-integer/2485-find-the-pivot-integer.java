class Solution {
    public int pivotInteger(int n) {
        int s=(n*(n+1))/2;
        int y=(int)Math.sqrt(s);
        if(y*y==s) return y;
        return -1;
    }
}