class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int V=numCourses;
        for(int i=0;i<V;i++) graph.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph.get(v).add(u);
        }
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int j=0;j<graph.get(i).size();j++){
                int next=graph.get(i).get(j);
                indegree[next]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.add(i);
        }
        int c=0;
        ArrayList<Integer> order=new ArrayList<>();
         while(!q.isEmpty()){
            int curr=q.poll();
            c++;
            order.add(curr);
            for(int i=0;i<graph.get(curr).size();i++){
                int next=graph.get(curr).get(i);
                indegree[next]--;
                if(indegree[next]==0) q.add(next);
            }
         }
         int[] ans=new int[order.size()];
         for(int i=0;i<order.size();i++){
            ans[i]=order.get(i);
         }
         if(c!=V) return new int[0];
         return ans; 
         

    }
}