class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0,j=n-1;
        int d1=0,d2=0;

        while(j>=0){
            if(colors[i] !=colors[j]){
                d1=j-i;
                break;
            }
            j--;
        }

        i=0;
        j=n-1;
        while(i<n){
            if(colors[i] !=colors[j]){
                d2=j-i;
                break;
            }
            i++;
        }
        return Math.min(d1,d2);
    }
}