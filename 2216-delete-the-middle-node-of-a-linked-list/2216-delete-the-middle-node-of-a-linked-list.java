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
        // ListNode curr=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        if(head==null || head.next==null){
            return null;
        }
        for(int i=0; i<count/2-1;i++){
         temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }
}