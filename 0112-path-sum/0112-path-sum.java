/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean solve(int sum,TreeNode root,int targetSum){
        if(root ==null) return false;
        if(root.left ==null && root.right ==null) return sum+root.val==targetSum;
        boolean left=solve(sum+root.val,root.left,targetSum);
        boolean right=solve(sum+root.val,root.right,targetSum);
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return solve(0,root,targetSum);
    }
}