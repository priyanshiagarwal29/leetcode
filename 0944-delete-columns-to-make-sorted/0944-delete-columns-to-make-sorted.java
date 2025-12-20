class Solution {
    public boolean isUnsorted(String[] strs,int i){
        for(int j=1;j<strs.length;j++){
            if(strs[j].charAt(i) <strs[j-1].charAt(i))
            return true;
        }
        return false;
    }
    public int minDeletionSize(String[] strs) {
        int c=0;
        for(int i=0;i<strs[0].length();i++){
            if(isUnsorted(strs,i)) c++;
        }
        return c;
    }
}