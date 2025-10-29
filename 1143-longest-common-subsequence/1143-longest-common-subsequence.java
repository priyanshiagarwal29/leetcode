class Solution { 
    // RECURRSION
    // public int helper(String t1,String t2,int id1,int id2){
    //     if(id1==t1.length() || id2==t2.length()) return 0;
    //     else if(t1.charAt(id1)==t2.charAt(id2)) return 1+helper(t1,t2,id1+1,id2+1);
    //     else return Math.max(helper(t1,t2,id1+1,id2),helper(t1,t2,id1,id2+1));
    // }
    public int longestCommonSubsequence(String text1, String text2) {
        // return helper(text1,text2,0,0);

        // DP
        int[][] arr=new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                 arr[i][j]=arr[i-1][j-1]+1;

                 else {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                 }
            }
        }
        return arr[text1.length()][text2.length()];
   }
}