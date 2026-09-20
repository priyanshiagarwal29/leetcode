class Solution {
    public int reverseDegree(String s) {
        int ans=0;

        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            int val=26-(c-'a');
            int pro=val*(i+1);
            ans+=pro;

        }
        return ans;
    }
}