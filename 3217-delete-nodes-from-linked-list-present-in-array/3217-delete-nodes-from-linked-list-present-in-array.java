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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max=0;
        for(int num : nums){
            if(num >max){
                max=num;
            }
        }
         boolean[] set = new boolean[max+1];

        for (int num : nums) {
            set[num]=true;
        }
        ListNode temp=head;
        ListNode prev=head;
        while (head != null && max>=head.val && set[head.val]) {
            head = head.next;
        }
        while(temp!= null){
            
                if(temp.val <= max &&  set[temp.val] ){
                       prev.next=temp.next; }
                        else {
                prev = temp; 
            }         
                    temp=temp.next;
            }
        
        return head;
    }
}