class Solution {
    public boolean isBalanced(HashMap<Character,Integer> map){
        int fre=-1;
        for(int val:map.values()){
            if(fre == -1) fre=val;
            else if(val !=fre) return false;
        }
        return true;
    }
    public int longestBalanced(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(isBalanced(map)) 
                    ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}