class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
           freq[c-'a']++;
        }
        int c=0,v=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20) v=Math.max(v,freq[i]);
            else{
                c=Math.max(c,freq[i]);
            }
        }
        return c+v;
    }
}