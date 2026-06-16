class Solution {
    public String processStr(String s) {
        StringBuilder st=new StringBuilder();
    for(char c:s.toCharArray()){
        if(Character.isLowerCase(c)){
            st.append(c);
        }
        else if(c=='*') {
            if(st.length()!=0)
            st.deleteCharAt(st.length()-1);
        }
        else if(c=='%'){
            st.reverse();
        }
        else if(c=='#'){
            st.append(st);
        }
    }
     return st.toString();
    }
}