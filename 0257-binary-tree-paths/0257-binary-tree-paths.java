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
    public void path(TreeNode root,List<String> arr,String s){
        if(root == null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            arr.add(s);
            return;
        }
        s+=root.val+"->";

        path(root.left,arr,s);
        path(root.right,arr,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        path(root,list,"");
        return list;
    }
}