class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[]  ans=new int[2];
        int c,r=0,maxc=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) c++;
            }
              if(c>maxc){
                maxc=c;
                r=i;
              }
        }
        ans[0]=r;
        ans[1]=maxc;
        return ans;
    }
}