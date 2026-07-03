class Solution {
    public boolean isPall(String s){
        int st=0,e=s.length()-1;

        while(st<e){
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int ans=s.length();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String st=s.substring(i,j+1);
                if(isPall(st)) ans++;
            }
        }
        return ans;
    }
}