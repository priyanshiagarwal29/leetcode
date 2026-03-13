class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);;
            if(ch=='(') st.push(ch);
            else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    if(st.isEmpty()) c++;
                }
            }
        }
        while(!st.isEmpty()) {
            st.pop();
            c++;
        }

        return c;
    }
}