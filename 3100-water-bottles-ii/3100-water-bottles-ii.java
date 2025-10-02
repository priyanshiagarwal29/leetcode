class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int c=numBottles,left=numBottles;
        while(left>=numExchange){
            c++;
            left-=numExchange;
            numExchange++;
            left++;
        }
        return c;
    }
}