import java.util.Stack;

public class Solution_3 {
    public static void deleteMiddle(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int middleIndex = stack.size() / 2 + 1;
        deleteMiddleHelper(stack, middleIndex);
    }

    private static void deleteMiddleHelper(Stack<Integer> stack, int current) {
        if (current == 1) {
            stack.pop();
            return;
        }

        int temp = stack.pop();
        deleteMiddleHelper(stack, current - 1);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        deleteMiddle(stack1);
        System.out.println("Modified stack: " + stack1); // Output: [1, 2, 4, 5]

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        deleteMiddle(stack2);
        System.out.println("Modified stack: " + stack2); // Output: [1, 2, 4, 5, 6]
    }
}
