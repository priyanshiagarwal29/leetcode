class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=numBottles,left=numBottles;
        while(left>=numExchange){
            int n=left/numExchange;
            c+=n;
            left=left%numExchange;
            left+=n;
        }
        return c;
    }
}