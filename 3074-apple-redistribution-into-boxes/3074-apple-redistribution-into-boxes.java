class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total=0,c=0;
        for(int n:apple) total+=n;
        Arrays.sort(capacity);

for (int i = 0; i < capacity.length / 2; i++) {
    int temp =  capacity[i];
    capacity[i] =  capacity[capacity.length - 1 - i];
     capacity[capacity.length - 1 - i] = temp;
}

        int i=0;
        while(i<capacity.length && total>0){
              total-=capacity[i];
              c++;
              i++;
        }
        return c;
    }
}