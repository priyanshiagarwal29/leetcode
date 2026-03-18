class Solution {
    public int strStr(String haystack, String needle) {
      int l=needle.length();
      int k=0;
      for(int i=0;i<haystack.length();i++)
      {
        if(i<=haystack.length()-l){
         if(haystack.substring(i,i+l).equals(needle) )
          return i;
        //   else if(haystack.substring(i+1,i+l+1).equals(needle))
        //     return i+1;
        }
      }
        return -1;
      }
    }