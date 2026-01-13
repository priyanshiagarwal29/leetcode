class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> graph,int curr,boolean[] visited){
        visited[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++){
            int next=graph.get(curr).get(i);
            if(!visited[next]){
                dfs(graph,next,visited); 
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        // dfs jo haar baaar call karte hai 
        // usme jab is visited check karte hai toh bas ussi ka count cgaiye like componets ki kitne different components hai different graphs
        // adjacenecy list banaenge + dfs coutn karenge bas ki kitne baar alag alag baar dfs call hua hai

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int V=isConnected.length;
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        boolean[] visited=new boolean[V];
        Arrays.fill(visited,false);
        int c=0;
        for(int i=0;i<V;i++){
          if(!visited[i]){
            c++;
            dfs(graph,i,visited);
          }
        }
        return c;

    }
}