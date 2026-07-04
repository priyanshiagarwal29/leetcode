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
    HashMap<TreeNode,Integer> dp=new HashMap<>();

    public int solve(TreeNode root){
        if(root==null) return 0;
        
        if(dp.containsKey(root)) return dp.get(root);

       int pick=root.val;
        if(root.left !=null){
         pick+=solve(root.left.left)+solve(root.left.right);
        }

        if(root.right !=null){
            pick+=solve(root.right.left)+solve(root.right.right);
        }

        int notpick=solve(root.left)+solve(root.right);

       dp.put(root,Math.max(pick,notpick)); 
       return Math.max(pick,notpick);
    
    }
    public int rob(TreeNode root) {

       return solve(root);
       
    }
}