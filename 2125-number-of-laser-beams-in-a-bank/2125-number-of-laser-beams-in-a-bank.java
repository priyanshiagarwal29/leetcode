class Solution {
    public int numberOfBeams(String[] bank) {
        int[] beams=new int[bank.length];
        int row=0;
        for(String i:bank){
            int c=0;
            for(int j=0;j<i.length();j++){
                if(i.charAt(j)=='1') c++;
            }
            beams[row]=c;
            row++;
        }
        int ans=0;
        List<Integer> mainrows = new ArrayList<>();
        for (int i = 0; i < beams.length; i++) {
            if (beams[i] != 0) mainrows.add(beams[i]);
        }
        for(int i=0;i<mainrows.size()-1;i++)
          ans+=mainrows.get(i)*mainrows.get(i+1);

          return ans;

    }
}