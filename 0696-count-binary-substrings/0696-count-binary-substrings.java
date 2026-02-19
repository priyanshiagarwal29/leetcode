class Solution {
    public int countBinarySubstrings(String s) {
        int ans=0;
        //0-1
        int i=0;
        while(i<s.length()){
            int j=i;
            boolean found0=false;
            while(j<s.length() && s.charAt(j)=='0'){
                j++;
                found0=true;
            }
            int c0=j-i;
            if(!found0){
                i++;
                continue;
            }
            int k=j;
            while(k<s.length() && s.charAt(k)=='1')
            k++;
            int c1=k-j;
            ans+=Math.min(c0,c1);
            i=j;
        }
         i=0;
        while(i<s.length()){
            int j=i;
            boolean found1=false;
            while(j<s.length() && s.charAt(j)=='1'){
                j++;
                found1=true;
            }
            int c1=j-i;
            if(!found1){
                i++;
                continue;
            }
            int k=j;
            while(k<s.length() && s.charAt(k)=='0')
            k++;
            int c0=k-j;
            ans+=Math.min(c0,c1);
            i=j;
        }

      return ans;
    }
}