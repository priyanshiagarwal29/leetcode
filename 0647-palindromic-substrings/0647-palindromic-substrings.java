class Solution {
    public boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
          if(s.charAt(i) !=s.charAt(j)) return false;
          i++;
          j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int c=s.length();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1)))
                 c++;
            }
        }
        return c;
    }
}