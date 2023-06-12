import java.util.*;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Step 1: Initialize stack and answer array
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        // Step 2: Traverse linked list in reverse order
        while (head != null) {
            list.add(head.val); // Store node values in a list
            head = head.next;
        }

        int n = list.size();
        int[] answer = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int currentValue = list.get(i);

            while (!stack.isEmpty() && stack.peek() <= currentValue) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek();
            }

            stack.push(currentValue);
        }

        // Step 3: Reverse the answer array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = answer[n - 1 - i];
        }

        return result;
    }
}
