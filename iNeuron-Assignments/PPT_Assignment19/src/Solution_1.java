import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        // Create a min-heap with a custom comparator
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head nodes of all lists to the min-heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Pop the smallest node from the min-heap and append it to the result list
        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();
            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;
    }

    // Helper method to create a linked list from an array
    private static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : nums) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper method to print a linked list
    private static void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Solution_1 merger = new Solution_1();

        ListNode[] lists1 = {
                createList(new int[]{1, 4, 5}),
                createList(new int[]{1, 3, 4}),
                createList(new int[]{2, 6})
        };
        ListNode mergedList1 = merger.mergeKLists(lists1);
        printList(mergedList1);
        // Output: 1 1 2 3 4 4 5 6

        ListNode[] lists2 = {};
        ListNode mergedList2 = merger.mergeKLists(lists2);
        printList(mergedList2);
        // Output: (empty list)

        ListNode[] lists3 = {null};
        ListNode mergedList3 = merger.mergeKLists(lists3);
        printList(mergedList3);
        // Output: (empty list)
    }
}
