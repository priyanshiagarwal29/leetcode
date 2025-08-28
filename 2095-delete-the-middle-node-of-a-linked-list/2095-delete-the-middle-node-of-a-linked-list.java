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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int c=0;
        if(head.next == null){
            return null;
        }
        while(temp != null){
            c++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<(c/2)-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}