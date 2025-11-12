/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode bst(ArrayList<Integer> nums,int l,int h){
        if(l>h) return null;
        int mid=(l+h)/2;
        TreeNode curr=new TreeNode(nums.get(mid));
        curr.left=bst(nums,l,mid-1);
        curr.right=bst(nums,mid+1,h);
        return curr;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        while(temp != null){
            arr.add(temp.val);
            temp=temp.next;
        }
        return bst(arr,0,arr.size()-1);
    }
}