class Solution {
    class Pair{
        int u,w;
        public Pair(int w,int v){
            this.w=w;
            this.u=v;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            graph.get(u).add(new int[]{v,w});
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        pq.add(new Pair(0,k));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int u=curr.u;
            int w=curr.w;
            if(w>dist[u]) continue;
            for(int i=0;i<graph.get(u).size();i++){
                int[] cur=graph.get(u).get(i);
                int v=cur[0];
                int vw=cur[1];
                if(vw+dist[u]<dist[v]){
                    dist[v]=vw+dist[u];
                    pq.add(new Pair(dist[v],v));
                }
            }
        }
        int ans=-1;
        for(int i=1;i<=n;i++){
            ans=Math.max(ans,dist[i]);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}