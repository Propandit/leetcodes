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
	Set<Integer> dup = new HashSet();
	for(int num : nums) dup.add(num);

	ListNode res = new ListNode(-1);
	ListNode trv = res;
	while(head != null) {
		if(!dup.contains(head.val)) {
			trv.next = head;
			trv = trv.next;
		}
		head = head.next;
	}
	trv.next = null;
	return res.next;
}
}