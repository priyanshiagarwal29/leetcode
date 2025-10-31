class Solution {
    public boolean isMatch(String s, String p) {
        
        int i=0,j=0,start=-1,idx=-1;
        while(i<s.length()){
            if(j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }
               else if( j<p.length() && p.charAt(j)=='*'){
                start=j;
                idx=i;
                j++;
               }
               else if(start!=-1){
                j=start+1;
                idx++;
                i=idx;
               }
               else return false;
            }

          while(j<p.length() && p.charAt(j)=='*') j++;
          return j==p.length();
            
        }

    }
