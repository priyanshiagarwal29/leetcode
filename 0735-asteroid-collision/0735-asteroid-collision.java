class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
            while(!st.isEmpty() && st.peek()>0 && a<0){
                int top=st.peek();
                if(top<-a) {
                    st.pop();
                    continue;
                }
                else if(top==-a) st.pop();
                a=0;
                break;
            }
            if(a !=0) st.push(a);
        }
        int[] res = new int[st.size()];
        int i = st.size() - 1;

        while(!st.isEmpty()) {
            res[i--] = st.pop();
        }

        return res;   

    }
}