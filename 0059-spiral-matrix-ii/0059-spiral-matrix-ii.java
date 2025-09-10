class Solution {
    public int[][] generateMatrix(int n) {
        int num=1;
        int[][] arr=new int[n][n];
        int top=0,bottom=n-1,left=0,right=n-1;
        //for 1st row
        while(num<=n*n){
            for(int i=left;i<=right;i++) arr[top][i]=num++;
            top++;
            for(int i=top;i<=bottom;i++) arr[i][right]=num++;
            right--;
            for(int i=right;i>=left;i--) arr[bottom][i]=num++;
            bottom--;
            for(int i=bottom;i>=top;i--) arr[i][left]=num++;
            left++;
        }
        return arr;


    }
}