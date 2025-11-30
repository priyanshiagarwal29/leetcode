class Pair{
    int first;
    int sec;
    int ind;
    public Pair(int f,int s,int ind){
        this.first=f;
        this.sec=s;
        this.ind=ind;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2) q.add(new Pair(i,j,2));
            }
        }
        int ans=0;
        while(!q.isEmpty()){
            int i=q.peek().first;
            int j=q.peek().sec;
            int k=q.peek().ind;
            ans=k;
            q.remove();
            if(i-1>=0 && grid[i-1][j]==1){
                q.add(new Pair(i-1,j,k+1));
                grid[i-1][j]=k+1;
            }
             if(i+1<m && grid[i+1][j]==1){
                q.add(new Pair(i+1,j,k+1));
                grid[i+1][j]=k+1;
            }
             if(j-1>=0 && grid[i][j-1]==1){
                q.add(new Pair(i,j-1,k+1));
                grid[i][j-1]=k+1;
            }
             if(j+1<n && grid[i][j+1]==1){
                q.add(new Pair(i,j+1,k+1));
                grid[i][j+1]=k+1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans-2;
        
    }
}