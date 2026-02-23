class Solution {
    public boolean hasAllCodes(String s, int k) {
         if(s.length()<=k) return false;
         int n = s.length();
         int i=0;
         HashSet<String> set=new HashSet<>();
         while(i+k<n){
            set.add(s.substring(i,i+k));
            i++;
         }
         return set.size()==Math.pow(2,k);

    }
}