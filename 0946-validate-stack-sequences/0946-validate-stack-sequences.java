class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        
        if(pushed.length != popped.length) return false;

        Stack<Integer> st=new Stack<>();

        while(i<pushed.length && j<popped.length){
            if(st.isEmpty()){
                st.push(pushed[i]);
                i++;
            }
             if(st.peek() != popped[j]){
                st.push(pushed[i]);
                i++;
            }
            if(st.peek()==popped[j]){
                st.pop();
                j++;
            }
           
        }
        if(!st.isEmpty()){
       while(j<popped.length && st.peek()==popped[j] ){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}