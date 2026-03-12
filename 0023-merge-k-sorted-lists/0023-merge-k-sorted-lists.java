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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(
            (a,b)->Integer.compare(a.val,b.val)
        );
        for(ListNode list:lists){
            if(list !=null) pq.add(list);
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;

        while(pq.size()>0){
            ListNode minNode=pq.poll();
            curr.next=minNode;
            curr=curr.next;

            if(minNode.next != null)
            pq.add(minNode.next);
        }
        return dummy.next;
    }
}