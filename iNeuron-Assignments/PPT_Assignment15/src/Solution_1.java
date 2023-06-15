import java.util.Arrays;
import java.util.Stack;

class Solution_1 {
    public int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements until finding a greater element or the stack becomes empty
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no greater element on the right
            // Assign -1 as the next greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            }
            // Assign the top element of the stack as the next greater element
            else {
                result[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }
}
