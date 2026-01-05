class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int cn=0;
        long ans=0L;
        int min=Integer.MAX_VALUE;
        for(int[] row:matrix){
            for(int n:row){
                if(n<0){
                    cn++;
                    n=-n;
                }
                ans+=n;
                min=Math.min(min,n);
            }
        }
        return (cn%2==0)? ans:(ans-2*min);
    }
}