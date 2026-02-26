class Solution {
    public int minMoves(int target, int maxDoubles) {
        int cnt=0;

        while(maxDoubles-->0 && target!=1){
          cnt++;
          cnt+=target%2;
          target=target/2;
        }

        if(target!=1){
            cnt+=target-1;
        }
        return cnt;
    }
}