class Solution {
    class pair{
        int i;
        int j;
        public pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }

    public void  bfs(char[][] grid,boolean[][] vis,int i,int j){
       vis[i][j]=true;
       Queue<pair> q=new LinkedList<>();
       q.add(new pair(i,j));

       while(!q.isEmpty()){
        int r=q.peek().i;
        int c=q.peek().j;
        q.remove();

        if(c-1>=0 && vis[r][c-1]==false && grid[r][c-1]=='1'){
            q.add(new pair(r,c-1));
            vis[r][c-1]=true;
        }
        
        if(c+1<grid[0].length && vis[r][c+1]==false && grid[r][c+1]=='1'){
            q.add(new pair(r,c+1));
            vis[r][c+1]=true;
        }

        if(r-1>=0 && vis[r-1][c]==false && grid[r-1][c]=='1'){
            q.add(new pair(r-1,c));
            vis[r-1][c]=true;
        }

        if(r+1<grid.length && vis[r+1][c]==false && grid[r+1][c]=='1'){
            q.add(new pair(r+1,c));
            vis[r+1][c]=true;
        }
       }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean[][] vis=new boolean[m][n];
        
        int cnt=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]!=true){
                    cnt++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        return cnt;
    }
}