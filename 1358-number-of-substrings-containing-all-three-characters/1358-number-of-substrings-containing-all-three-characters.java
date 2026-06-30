class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
       int left=0,right=0,ans=0;

       while(right<s.length()){
          map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
          while(map.size()==3){
            ans+=(s.length()-right);
             map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
             if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
             left++;

          }
          right++;
       }
        return ans;
    }
}