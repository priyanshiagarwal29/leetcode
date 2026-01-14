class Solution {
    public boolean check(ArrayList<ArrayList<Integer>> graph,int curr,int[] color,int curr_color){
        color[curr]=curr_color;
        for(int i=0;i<graph.get(curr).size();i++){
            int next=graph.get(curr).get(i);
            if(color[next]==curr_color) return false;
            
            if(color[next] ==-1){
             int new_color=1-curr_color;
            if(check(graph,next,color,new_color)==false) return false;
                }
            }
            return true;
    }
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> graphs=new ArrayList<>();
        int V=graph.length;
        for(int i=0;i<V;i++) graphs.add(new ArrayList<>());
        for(int i=0;i<V;i++){
           for(int j=0;j<graph[i].length;j++){
            int edge=graph[i][j];
            graphs.get(i).add(edge);
           }
        }
        int[] color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
           if(color[i]==-1){
             if(check(graphs,i,color,0)==false) return false;
           }
        }
        return true;
    }
}