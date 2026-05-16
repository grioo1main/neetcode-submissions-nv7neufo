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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode dummy = result;
        int remainder = 0;
        while (l1 != null && l2 != null) {
            int res = remainder + l1.val + l2.val;
            if (res >= 10) {
                remainder = 1;
                result.next = new ListNode(res - 10);
            } else {
                remainder = 0;
                result.next = new ListNode(res);
            }
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
                int res = remainder + l1.val;
                if (res >= 10) {
                    remainder = 1;
                    result.next = new ListNode(res - 10);
                } else {
                    remainder = 0;
                    result.next = new ListNode(res);
                }
                result = result.next;
                l1 = l1.next;
            }

        } else if (l2 != null) {
            while (l2 != null) {
                int res = remainder + l2.val;
                if (res >= 10) {
                    remainder = 1;
                    result.next = new ListNode(res - 10);
                } else {
                    remainder = 0;
                    result.next = new ListNode(res);
                }
                result = result.next;
                l2 = l2.next;
            }
        }
        if (remainder > 0) {
            result.next = new ListNode(1);
        }
        return dummy.next;
    }
}
