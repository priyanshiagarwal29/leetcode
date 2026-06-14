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
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int ans=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.size();i++){
            sum=arr.get(i)+arr.get(arr.size()-1-i);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}