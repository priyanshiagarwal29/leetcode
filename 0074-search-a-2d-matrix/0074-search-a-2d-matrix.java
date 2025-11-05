class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        while(top<=bottom){
            int mid=(top+bottom)/2;
            if(matrix[mid][0]==target || matrix[mid][n-1]== target) return true;
            else if(matrix[mid][0]< target && matrix[mid][n-1]> target){
                int left=0,right=n-1;
                while(left<=right){
                    int mv=(left+right)/2;
                    if(matrix[mid][mv]== target) return true;
                    else if(matrix[mid][mv]< target) left=mv+1;
                    else right=mv-1;
                }
                return false; 
            }
            else if(matrix[mid][0]>target) bottom=mid-1;
            else top=mid+1;
        }
        return false;
    }
}