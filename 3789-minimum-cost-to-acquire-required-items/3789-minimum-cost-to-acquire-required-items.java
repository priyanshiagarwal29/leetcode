class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = Math.min((long) costBoth, (long) cost1 + cost2);
        long need = Math.min(need1, need2);

        long res = cost * need;

        need1 -= need;
        need2 -= need;

        if (need1 > 0) {
            res += (long) need1 * Math.min(cost1, costBoth);
        }

        if (need2 > 0) {
            res += (long) need2 * Math.min(cost2, costBoth);
        }

        return res;
    }
}