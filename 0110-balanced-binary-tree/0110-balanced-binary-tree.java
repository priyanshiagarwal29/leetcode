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
    public int solve(TreeNode root){
        if(root==null) return 0 ;
        if(root.left==null && root.right==null) return 1;
        int left=1+solve(root.left);
        int right=1+solve(root.right);
        if(Math.abs(left-right)>1) ans= false;
        return Math.max(left,right);
    }
    boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        solve(root);
        return ans;
    }
}