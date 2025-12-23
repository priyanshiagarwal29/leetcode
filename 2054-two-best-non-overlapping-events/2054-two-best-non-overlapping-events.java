class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        
        int[][] endsort=events.clone();
         Arrays.sort(endsort, (a, b) -> a[1] - b[1]);

         int n=events.length;
         int[] memo=new int[n];
         memo[0]=endsort[0][2];
         for(int i=1;i<n;i++){
            memo[i]=Math.max(memo[i-1],endsort[i][2]);
         }

         int ans=0;
         int j=0;
         for(int i=0;i<n;i++){
            int s=events[i][0];
            int v=events[i][2];

            while(j<n && endsort[j][1]<s) j++;

            ans=Math.max(ans,v);
            if(j>0) ans=Math.max(ans,v+memo[j-1]);
         }

        return ans;

    }
}