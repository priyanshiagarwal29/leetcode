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
    long ans=0;
    static final int MOD=1000000007;
    public long total(TreeNode root){
        if(root == null) return 0;
        return root.val+total(root.left)+total(root.right);
    }
    public long dfs(TreeNode node,long total){
        if(node == null) return 0;
        long s=node.val+dfs(node.left,total)+dfs(node.right,total);
        ans=Math.max(ans,s*(total-s));
        return s;
    }

    public int maxProduct(TreeNode root) {
        long totalSum=total(root);
        dfs(root,totalSum);
        return (int)(ans%MOD);  
    }
}