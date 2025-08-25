import java.util.*;

class Solution {
    public void solve(int[] arr, List<Integer> ds, int target, List<List<Integer>> ans, int i) {
        // Base case: found a valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Stop if out of bounds or invalid target
        if (i == arr.length || target < 0) {
            return;
        }

        // Pick current element (if possible)
        if (arr[i] <= target) {
            ds.add(arr[i]);
            solve(arr, ds, target - arr[i], ans, i); // stay at i (reuse allowed)
            ds.remove(ds.size() - 1);
        }

        // Skip current element
        solve(arr, ds, target, ans, i + 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, new ArrayList<>(), target, ans, 0);
        return ans;
    }
}
