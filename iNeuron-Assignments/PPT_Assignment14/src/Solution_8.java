class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current != null) {
            int sum = 0;
            ListNode runner = current.next;

            while (runner != null) {
                sum += runner.val;

                if (sum == 0) {
                    current.next = runner.next;
                }

                runner = runner.next;
            }

            current = current.next;
        }

        return dummy.next;
    }
}
