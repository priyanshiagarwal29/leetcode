class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder cur=new StringBuilder();
        dfs(n,n,cur,ans);
        return ans;
    }

    public void dfs(int start,int end,StringBuilder cur,List<String> ans){
            if(start==0 && end ==0){
                ans.add(cur.toString());
                return ;
            }
            if(start>0){
                cur.append('(');
                dfs(start-1,end,cur,ans);
                cur.deleteCharAt(cur.length()-1);
            }
            if(end> start){
                cur.append(')');
                dfs(start,end-1,cur,ans);
                cur.deleteCharAt(cur.length()-1);
            }
        
    }
}