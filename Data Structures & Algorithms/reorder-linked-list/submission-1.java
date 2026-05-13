class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode nextTemp;
        while (curr != null) {
            nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        ListNode l = head;
        ListNode r = prev;

        while (r != null) {
            ListNode tempL = l.next;
            ListNode tempR = r.next;

            l.next = r;
            r.next = tempL;

            l = tempL;
            r = tempR;
        }
    }
}