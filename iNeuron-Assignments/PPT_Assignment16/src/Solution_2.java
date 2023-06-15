import java.util.Stack;

public class Solution_2 {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(34);
        stack1.push(3);
        stack1.push(31);
        stack1.push(98);
        stack1.push(92);
        stack1.push(23);
        sortStack(stack1);
        System.out.println("Sorted stack: " + stack1); // Output: [3, 23, 31, 34, 92, 98]

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(3);
        stack2.push(5);
        stack2.push(1);
        stack2.push(4);
        stack2.push(2);
        stack2.push(8);
        sortStack(stack2);
        System.out.println("Sorted stack: " + stack2); // Output: [1, 2, 3, 4, 5, 8]
    }
}
