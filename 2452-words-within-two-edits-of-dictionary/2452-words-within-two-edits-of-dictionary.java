class Solution {
    public boolean match(String word,String[] dict){
       
        for(String d:dict){
            int diff=2;
            for(int i=0;i<word.length();i++){
                if(d.charAt(i)!=word.charAt(i)) diff--;
                if(diff<0) break;
            }
            if(diff>=0) return true;
        }
        return false;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> ans=new ArrayList<>();
        for(String q:queries){
            if(match(q,dictionary)){
                ans.add(q);
            }
        }
        return ans;
    }
}