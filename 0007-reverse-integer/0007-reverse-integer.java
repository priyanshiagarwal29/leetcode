class Solution {
    public int reverse(int x) {
        int d,r=0;
        
        boolean ans=true;
        if(x<0){
            ans=false;
            x=-x;
        }
        while(x>0){
            d=x%10;
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && d > 7)) return 0;
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && d < -8)) return 0;

            r=(r*10)+d;
            x=x/10;
        }
        if(ans != true){
            return -r;
        }
        return r;
    }
}