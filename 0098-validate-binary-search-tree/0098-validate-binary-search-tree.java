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
    public boolean isvalid(TreeNode root,Integer left,Integer right){
        if(root==null) return true;
        
        if( left !=null && root.val<=left) return false;
        if(right !=null && root.val>=right) return false;
        boolean lefts=isvalid(root.left,left,root.val);
        boolean rights= isvalid(root.right,root.val,right);
        return lefts && rights;
    }
    public boolean isValidBST(TreeNode root) {
        return isvalid(root,null,null);
    }
}