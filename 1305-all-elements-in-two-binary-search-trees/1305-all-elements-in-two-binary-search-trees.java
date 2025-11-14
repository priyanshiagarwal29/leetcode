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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr=new ArrayList<>();
        TreeNode pre;
        TreeNode curr=root1;
        while(curr != null){
            if(curr.left !=null){
                 pre=curr.left;
                while(pre.right !=null && pre.right != curr) pre=pre.right;
                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }
                if(pre.right == curr) {
                    pre.right=null;
                    arr.add(curr.val);
                    curr=curr.right;
            }
            }
            else{
                arr.add(curr.val);
                curr=curr.right;
            }
        }

        ArrayList<Integer> arr1=new ArrayList<>();
         curr=root2;
        while(curr != null){
            if(curr.left !=null){
                pre=curr.left;
                while(pre.right !=null && pre.right != curr) pre=pre.right;
                if(pre.right==null){
                    pre.right=curr;
                    curr=curr.left;
                }
                if(pre.right == curr) {
                    pre.right=null;
                    arr1.add(curr.val);
                    curr=curr.right;
            }
            }
            else{
                arr1.add(curr.val);
                curr=curr.right;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        merge(arr,arr1,ans);
        return ans;
    }
    public List<Integer> merge(ArrayList<Integer> a,ArrayList<Integer> b ,ArrayList<Integer> ans){
        int i=0,j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<=b.get(j)) {
                ans.add(a.get(i));
                i++;
            }
            else{
                ans.add(b.get(j));
                j++;
            }
        }
        if(i==a.size()){
            while(j<b.size()){
                ans.add(b.get(j));
                j++;
            }
        }
         if(j==b.size()){
            while(i<a.size()){
                ans.add(a.get(i));
                i++;
            }
        }
        return ans;
    }
}