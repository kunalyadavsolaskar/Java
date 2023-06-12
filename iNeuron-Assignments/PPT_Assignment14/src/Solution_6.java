class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode leftShift(ListNode head, int k) {
        if (head == null || k == 0)
            return head;

        ListNode current = head;
        int count = 1;

        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null)
            return head;

        ListNode newHead = current.next;
        current.next = null;

        current = newHead;
        while (current.next != null)
            current = current.next;

        current.next = head;

        return newHead;
    }
}
