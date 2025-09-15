class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set=new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            set.add(c);
        }
        int ans=0,space=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                if(space==0) ans++;
                space=0;
                continue;
            }
            if(set.contains(text.charAt(i))) space++;
           
            
        }
        if(space == 0) ans++;
        return ans;
    }
}