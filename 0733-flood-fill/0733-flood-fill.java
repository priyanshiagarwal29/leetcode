
class Pair{
    int first;
    int sec;
    public Pair(int f,int s){
          this.first=f;
          this.sec=s;
    }
}
    class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        int m=image.length;
        int n=image[0].length;
        if(original==color) return image;
        image[sr][sc]=color;
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(sr,sc));
       while(!q.isEmpty()){
        int i=q.peek().first;
        int j=q.peek().sec;
        q.remove();
            if(j-1>=0 && image[i][j-1]==original){
                q.add(new Pair(i,j-1));
                image[i][j-1]=color;
            }
             if(j+1<n && image[i][j+1]==original){
                q.add(new Pair(i,j+1));
                image[i][j+1]=color;
            }
             if(i-1>=0 && image[i-1][j]==original){
                q.add(new Pair(i-1,j));
                image[i-1][j]=color;
            }
             if(i+1<m && image[i+1][j]==original){
                q.add(new Pair(i+1,j));
                image[i+1][j]=color;
            }
           
        }
        return image;
       }
    }
