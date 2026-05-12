class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a,b)-> b[1] - b[0] - (a[1] - a[0]));

        int start=tasks[0][1];
        int left=tasks[0][1]-tasks[0][0];
        int want=0;

      for(int i=1;i<tasks.length;i++){
        int curr=tasks[i][0];
        int max=tasks[i][1];

        if(left<max){
            want+=max-left;
            left=max;
        }
        left-=curr;
      }
      return start+want;
    }
}