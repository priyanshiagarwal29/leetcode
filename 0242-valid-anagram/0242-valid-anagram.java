class Solution {
    public boolean isAnagram(String s, String t) {
        char[] f1=new char[26];
        char[] f2=new char[26];


         s=s.toLowerCase();
         t=t.toLowerCase();
        for(char c:s.toCharArray()){
            f1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            f2[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]) return false;
        }
        return true;

    }
}