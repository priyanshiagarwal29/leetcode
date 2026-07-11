class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> graph,int curr,boolean[] vis,int[] count){
        vis[curr]=true;
        count[0]++;
        count[1]+=graph.get(curr).size();
        for(int i=0;i<graph.get(curr).size();i++){
            int next=graph.get(curr).get(i);
            if(!vis[next]){
                dfs(graph,next,vis,count);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] vis=new boolean[n];
        int comp=0;

        for(int i=0;i<n;i++){
            int[] count=new int[2];
            if(vis[i] !=true){
                dfs(graph,i,vis,count);
                int node=count[0];
                int degree=count[1];
            
            if(degree==node*(node-1)) comp++;
        }
        }
        return comp;
    }
}