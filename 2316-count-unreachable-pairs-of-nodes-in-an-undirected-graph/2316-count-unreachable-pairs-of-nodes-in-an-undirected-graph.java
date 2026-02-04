class Solution {
    int[] parent;
    int[] rank;
    public int find(int x){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x]);
    }
    public void union(int x,int y){
        int x_parent=find(x);
        int y_parent=find(y);
        if(x_parent==y_parent) return;
        if(rank[x_parent]>rank[y_parent])
            parent[y_parent]=x_parent;
        if(rank[y_parent]>rank[x_parent])
            parent[x_parent]=y_parent;
        if(rank[x_parent]==rank[y_parent]){
            parent[x_parent]=y_parent;
            rank[y_parent]++;
        }
        

    }
    public long countPairs(int n, int[][] edges) {
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
        //making components
       for(int[] e:edges){
           union(e[0],e[1]);
       }
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        int p=find(i);
         map.put(p,map.getOrDefault(p,0)+1);
       }
       long ans=0;
       long remain=n;
       for(int e:map.values()){
        ans+=e*(remain-e);
        remain-=e;
       }
       return ans;
    }
}