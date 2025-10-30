class Solution {
    // public int helper(String s,int i,int j){
    //     if(i>j) return 0;
    //     if(i==j) return 1;
    //     if(s.charAt(i)==s.charAt(j)) return 2+helper(s,i+1,j-1);
    //     else return Math.max(helper(s,i+1,j),helper(s,i,j-1));
    // }
    public int longestPalindromeSubseq(String s) {
        // return helper(s,0,s.length()-1);
        int[][] cache=new int[s.length()][s.length()];
         return solve(s, 0,s.length()-1, cache);
        }
    public int solve(String s,int i,int j,int[][] cache){
         if(i>j) return 0;
        if(i==j) return 1;
        if(cache[i][j] !=0) return cache[i][j];
        else{
            if(s.charAt(i)==s.charAt(j)) cache[i][j]=2+solve(s,i+1,j-1,cache);
            else cache[i][j]=Math.max(solve(s,i+1,j,cache),solve(s,i,j-1,cache));
        }
        return cache[i][j];
    }
    }
    
