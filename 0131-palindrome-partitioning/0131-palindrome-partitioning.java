class Solution {
    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    public void helper(String s, int idx, List<String> res, List<List<String>> ans) {
        if (idx == s.length()) {
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                // choose
                res.add(s.substring(idx, i + 1));
                // explore from next index (i + 1)
                helper(s, i + 1, res, ans);
                // un-choose (backtrack)
                res.remove(res.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), ans);
        return ans;
    }
}
