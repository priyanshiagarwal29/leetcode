class Solution {
    public int smallestNumber(int n) {
        int x=n;
        while(true){
        if((x&(x+1))==0) 
         return x;
         x++;

        } 
       
    }
}