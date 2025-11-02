class Solution {
    public void helper(TreeNode root,List<List<Integer>> ans,List<Integer> arr,int targetsum,int sum){
        if(root== null) return;

        sum += root.val;
        arr.add(root.val);

        if(root.left == null && root.right == null && sum == targetsum) 
            ans.add(new ArrayList<>(arr));

        helper(root.left, ans, arr, targetsum, sum);
        helper(root.right, ans, arr, targetsum, sum);

        arr.remove(arr.size() - 1); // ✅ fix
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, ans, new ArrayList<>(), targetSum, 0);
        return ans;
    }
}
