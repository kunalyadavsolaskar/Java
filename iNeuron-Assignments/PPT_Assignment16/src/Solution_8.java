import java.util.Stack;

public class Solution_8 {
    public static int maxDifference(int[] arr) {
        int n = arr.length;

        // Arrays to store the nearest left and right smaller elements
        int[] leftSmaller = new int[n];
        int[] rightSmaller = new int[n];

        // Fill the leftSmaller array
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftSmaller[i] = 0;
            } else {
                leftSmaller[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        // Clear the stack for rightSmaller array
        stack.clear();

        // Fill the rightSmaller array
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightSmaller[i] = 0;
            } else {
                rightSmaller[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        // Find the maximum difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(leftSmaller[i] - rightSmaller[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 8};
        System.out.println("Maximum Difference: " + maxDifference(arr1)); // Output: 1

        int[] arr2 = {2, 4, 8, 7, 7, 9, 3};
        System.out.println("Maximum Difference: " + maxDifference(arr2)); // Output: 4

        int[] arr3 = {5, 1, 9, 2, 5, 1, 7};
        System.out.println("Maximum Difference: " + maxDifference(arr3)); // Output: 1
    }
}
