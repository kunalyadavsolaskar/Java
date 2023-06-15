import java.util.Arrays;
import java.util.Stack;

class Solution_2 {
    public int[] nearestSmallerElements(int[] a) {
        int n = a.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate from left to right
        for (int i = 0; i < n; i++) {
            // Pop elements until finding a smaller element or the stack becomes empty
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }

            // If stack is empty, there is no smaller element on the left
            // Assign -1 as the nearest smaller element
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            // Assign the top element of the stack as the nearest smaller element
            else {
                result[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(a[i]);
        }

        return result;
    }
}
