class Solution {
    public int maxDistance(int[] colors) {
        int i=0,j=colors.length-1;
        int d1=0,d2=0;
        while(i<=j){
            if(colors[i] != colors[j]){
             d1=j-i;
             break;
            }
                j--;
        }
        i=0;j=colors.length-1;
        while(i<=j){
            if(colors[i]!=colors[j]){
               d2= j-i;
               break;
            }
         
            i++;
        }
        return Math.max(d1,d2);
    }
}