class Pair{
    int u,w;
    public Pair(int u,int w){
        this.u=u;
        this.w=w;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        ArrayList<ArrayList<int[]>> graph=new ArrayList<>();
        int n=points.length;
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                int dist=Math.abs(x1-x2) +Math.abs(y1-y2);
                graph.get(i).add(new int[]{j,dist});
                graph.get(j).add(new int[]{i,dist});
            }
        }
        int sum=0;
        boolean[] visited=new boolean[n];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int node=curr.u;
            int w=curr.w;
            if(visited[node]==true) continue;
            visited[node]=true;
            sum+=w;
            for(int i=0;i<graph.get(node).size();i++){
                int[] neigh=graph.get(node).get(i);
                int v=neigh[0];
                int d=neigh[1];
                if(visited[v] !=true) pq.add(new Pair(v,d));
            }
        }
        return sum;
    }
}