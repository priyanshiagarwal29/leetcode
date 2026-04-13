class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        int st=0,e=n-1;

        while(st<=e){

            if(!Character.isLetterOrDigit(s.charAt(st))) st++;

            else if(!Character.isLetterOrDigit(s.charAt(e))) e--;

            else if(s.charAt(st) !=s.charAt(e)) return false;

            else{
                st++;
                e--;
            }

        }
        return true;
    }
}