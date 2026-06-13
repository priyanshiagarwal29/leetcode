class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                sum+=weights[c-'a'];
            }
            int val=sum%26;
            char ch=(char)('z'-val);
            ans.append(ch);
        }
        return ans.toString();
    }
}