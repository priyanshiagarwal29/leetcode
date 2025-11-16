class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) return new ArrayList<>();

       int[] pcount=new int[26];
        for(char c:p.toCharArray()) pcount[c-'a']++;
          
        int[] scount=new int[26];
        for(int i=0;i<p.length();i++){
            char c=s.charAt(i);
            scount[c-'a']++;   
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(Arrays.equals(pcount,scount)) ans.add(0);
        for(int i=p.length();i<s.length();i++){
            char c=s.charAt(i);
            char out=s.charAt(i-p.length());
            scount[out-'a']--;
            scount[c-'a']++;
           if(Arrays.equals(scount,pcount)) ans.add(i-p.length()+1);
        }
        return ans;
        
    }
}