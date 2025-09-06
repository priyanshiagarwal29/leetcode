class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int col=matrix.length;
        int row=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        int top=0,bottom=col-1,left=0,right=row-1;
        while(top<=bottom && left<=right){
            //for left to right
            for(int i=left;i<=right;i++) list.add(matrix[top][i]);
            top++;
          
          //for top to bottom(side col)
         
         for(int i=top;i<=bottom;i++) list.add(matrix[i][right]);
         right--;
          

         //for bottom row right to left
         if(top<=bottom){
         for(int i=right;i>=left;i--) list.add(matrix[bottom][i]);
         bottom--;
         }

         //for bottom to top
         if(left<=right){
         for(int i=bottom;i>=top;i--) list.add(matrix[i][left]);
         left++;
         }
        }
        return list;
    }
}