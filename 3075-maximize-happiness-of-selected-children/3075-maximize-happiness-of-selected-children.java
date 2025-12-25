class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long c = 0;
        int taken = 0;
        int i = happiness.length - 1;

        while (i >= 0 && k > 0) {
            long curr = happiness[i] - taken;
            if (curr > 0) {
                c+= curr;
            }
            taken++;
            k--;
            i--;
        }
        return c;
    }
}
