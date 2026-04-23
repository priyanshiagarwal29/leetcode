class Solution {
    public long[] distance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        long[] ans = new long[n];

        
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

       
        for (List<Integer> list : map.values()) {
            int size = list.size();
            if (size == 1) continue;

            long totalSum = 0;
            for (int idx : list) totalSum += idx;

            long prefixSum = 0;

            for (int k = 0; k < size; k++) {
                int idx = list.get(k);

                long left = (long) idx * k - prefixSum;
                long right = (totalSum - prefixSum - idx) - (long) idx * (size - k - 1);

                ans[idx] = left + right;

                prefixSum += idx;
            }
        }

        return ans;
    }
}