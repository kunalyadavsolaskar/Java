import java.util.Stack;

public class Solution_7 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Solution_7() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Solution_7 minStack = new Solution_7();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Min: " + minStack.getMin()); // Output: -3
        minStack.pop();
        System.out.println("Top: " + minStack.top()); // Output: 0
        System.out.println("Min: " + minStack.getMin()); // Output: -2
    }
}
