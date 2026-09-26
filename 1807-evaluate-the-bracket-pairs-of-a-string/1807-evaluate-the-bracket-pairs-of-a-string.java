class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map=new HashMap<>();

       for(List<String> list : knowledge) {
            map.put(list.get(0),list.get(1));
        }

        StringBuilder st=new StringBuilder();

        for(int i=0;i<s.length();i++){
            {
                if(s.charAt(i)=='('){
                int j=s.indexOf(")",i+1);
                st.append(map.getOrDefault(s.substring(i+1,j),"?"));
                i=j;
            }
            else{
                st.append(s.charAt(i));
            }

        }
    }
        return st.toString();
}
}