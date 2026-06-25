class Solution {
    public boolean isprefixsuffix(String s,String t){
        int ls=s.length();
        int lt=t.length();

        if(lt<ls) return false;

        for(int i=0;i<ls;i++){
            if(t.charAt(i)!=s.charAt(i) || t.charAt(lt-ls+i)!=s.charAt(i)) return false;
        }
        return true;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int c=0;

        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isprefixsuffix(words[i],words[j])) c++;
            }
        }
        return c;
    }
}