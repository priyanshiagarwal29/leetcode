class Solution {
    public StringBuilder addone(StringBuilder st){
        int i=st.length()-1;
        
        while(i>=0 && st.charAt(i)=='1' ){
            st.setCharAt(i,'0');
            i--;
        }

        if(i>=0){
            st.setCharAt(i,'1');
        }
        else{
          st.insert(0,'1');
        }

        return st;
    }
    public int numSteps(String s) {
      int c=0;
      StringBuilder st=new StringBuilder(s);
      while(!(st.length()==1)){
        if(st.charAt(st.length()-1)=='0'){
            st.deleteCharAt(st.length()-1);
        }
        else{
            addone(st);
        }
        c++;
      }
      return c;
    }
}