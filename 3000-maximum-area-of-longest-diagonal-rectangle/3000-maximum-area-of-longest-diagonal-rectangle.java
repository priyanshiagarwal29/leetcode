class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans=0;double maxd=0,d=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            d=Math.sqrt(l*l+b*b);
            if(d>maxd || (d==maxd && ans<l*b) ){
            ans=l*b;
            maxd=d;
        }
        }
        return ans;
    }
}