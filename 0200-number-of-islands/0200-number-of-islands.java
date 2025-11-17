class Pair{
    int first;
    int sec;
    public Pair(int i,int j){
        this.first=i;
        this.sec=j;
    }
}

class Solution {

    public static void bfs(char[][] grid,boolean[][] vis,int i,int j){
        vis[i][j]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().sec;
            q.remove();
            if(c-1>=0 && vis[r][c-1]== false && grid[r][c-1]=='1') {
                q.add(new Pair(r,c-1));
                vis[r][c-1]=true;
            }
             if(c+1<grid[0].length && vis[r][c+1]== false && grid[r][c+1]=='1') {
                q.add(new Pair(r,c+1));
                vis[r][c+1]=true;
            }
             if(r-1>=0 && vis[r-1][c]== false && grid[r-1][c]=='1') {
                q.add(new Pair(r-1,c));
                vis[r-1][c]=true;
            }
            if(r+1<grid.length && vis[r+1][c]== false && grid[r+1][c]=='1') {
                q.add(new Pair(r+1,c));
                vis[r+1][c]=true;
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int cnt=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(grid[i][j]=='1'){
                if(vis[i][j]==false){
                    cnt++;
                    bfs(grid,vis,i,j);
                }
              }
            }
        }
        return cnt;
    }
}