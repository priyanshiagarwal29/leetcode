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
    public static ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,next=null;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        }
         public static ListNode add(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        int sum=0;
        while(l1 !=null && l2 !=null){
            sum=l1.val+l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newnode=new ListNode(sum);
            tail.next=newnode;
            tail=tail.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 !=null){
            sum=l1.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newnode=new ListNode(sum);
            tail.next=newnode;
            tail=tail.next;
            l1=l1.next;
        }
        while(l2 !=null){
            sum=l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newnode=new ListNode(sum);
            tail.next=newnode;
            tail=tail.next;
            l2=l2.next;
        }
        if(carry>0) tail.next = new ListNode(carry);
       return dummy.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode1=reverse(l1);
   ListNode newNode2=reverse(l2);
   
   ListNode added=add(newNode1,newNode2);
   ListNode ans=reverse(added);
   return ans;
    }
}