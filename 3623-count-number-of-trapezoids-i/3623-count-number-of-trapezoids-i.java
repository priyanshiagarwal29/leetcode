class Solution {
    static final int MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            int y=points[i][1];
            map.put(y,map.getOrDefault(y,0)+1);
        }
        long ans=0;
        long prev=0;
        for(int c:map.values()){
            if(c<2) continue;
            long pairs=c*(c-1L)/2;
            ans=(ans+prev*pairs)%MOD;
            prev=(prev+pairs)%MOD;
        }
        return (int)ans;
    }
}