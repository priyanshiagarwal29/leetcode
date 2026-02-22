class Solution {
    public int binaryGap(int n) {
        int posi=-1;
        int gap=0;
        int curr=0;
        while(n>0){
            if((n&1)==1){
                if(posi!=-1){
                    gap=Math.max(curr-posi,gap);
                }
                posi=curr;
            }
            n=n>>1;
            curr++;
        }
        return gap;
    }
}