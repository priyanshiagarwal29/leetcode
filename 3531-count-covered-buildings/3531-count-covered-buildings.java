
class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        HashMap<Integer,TreeSet<Integer>> xvalues=new HashMap<>();
        HashMap<Integer,TreeSet<Integer>> yvalues=new HashMap<>();
        for(int i=0;i<buildings.length;i++){
            int x=buildings[i][0],y=buildings[i][1];
            xvalues.computeIfAbsent(x,k-> new TreeSet<>()).add(y);
            yvalues.computeIfAbsent(y,k-> new TreeSet<>()).add(x);
        }
        int ans=0;
         for(int i=0;i<buildings.length;i++){
            int x=buildings[i][0],y=buildings[i][1];
            TreeSet<Integer> col=xvalues.get(x);
             TreeSet<Integer> row=yvalues.get(y);

             Integer left=col.lower(y);
             Integer right=col.higher(y);
             Integer up=row.lower(x);
             Integer down=row.higher(x);

             if((left !=null) && (right !=null) && (up!=null) && (down!=null)) 
               ans++;
         }
      return ans;
    }
}