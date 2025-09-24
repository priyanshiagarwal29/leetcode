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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        Stack<ListNode> st=new Stack<>();

    while(curr != null){
        while(!st.isEmpty() && st.peek().val<curr.val) st.pop();
        st.push(curr);
        curr=curr.next;
    }
   ListNode d=null;
   while(!st.isEmpty()){
    curr=st.pop();
    if(curr ==null) break;
    curr.next=d;
    d=curr;
   }
   return d;
     
    }
}