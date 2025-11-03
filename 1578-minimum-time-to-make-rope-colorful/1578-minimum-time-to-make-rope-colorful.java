class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int cost = 0;
        int prev = 0; // pointer to the previous balloon that remains

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(prev)) {
                // remove the one with smaller neededTime
                cost += Math.min(neededTime[i], neededTime[prev]);
                
                // keep the one with larger neededTime for next comparison
                if (neededTime[i] > neededTime[prev]) {
                    prev = i;
                }
            } else {
                prev = i; // move prev pointer when colors differ
            }
        }
        return cost;
    }
}
