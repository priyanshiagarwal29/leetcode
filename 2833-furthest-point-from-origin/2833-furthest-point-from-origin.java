class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0;
        int curr=0;

        for(char ch:moves.toCharArray()){
           if(ch=='_') c++;
           if(ch=='L') curr--;
           if(ch=='R') curr++;
        }

        int ans= curr>0?curr+c:curr-c;
        return ans>0? ans:-ans;
    }
}