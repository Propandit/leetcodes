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
        //   if(head==null || head.next==null){
        //     return null;
        // }
        // ListNode temp=head;
        //  ListNode curr=head;
        // int count=0;

        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }
        // int n=count/2;
      
        // for(int i=0; i<n-1;i++){
        //  curr=curr.next;
        // }
        // curr.next=curr.next.next;

        // return head;
          if(head.next==null || head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
         fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        
        }
        slow.next=slow.next.next;
        return head;
    }
}