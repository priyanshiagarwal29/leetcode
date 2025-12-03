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
    public TreeNode bst(int[]nums,int l,int h){
        if(l>h) return null;
        int mid=(l+h)/2;
        TreeNode curr=new TreeNode(nums[mid]);
        curr.left=bst(nums,l,mid-1);
        curr.right=bst(nums,mid+1,h);
        return curr;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }
}