import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution_4 {
    public static String checkOrder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> secondQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();

            while (!stack.isEmpty() && stack.peek() < current) {
                secondQueue.add(stack.pop());
            }

            stack.push(current);
        }

        while (!stack.isEmpty()) {
            secondQueue.add(stack.pop());
        }

        int prev = secondQueue.poll();
        while (!secondQueue.isEmpty()) {
            int current = secondQueue.poll();
            if (prev > current) {
                return "No";
            }
            prev = current;
        }

        return "Yes";
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(5);
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        System.out.println("Can be arranged in increasing order? " + checkOrder(queue1)); // Output: Yes

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(5);
        queue2.add(1);
        queue2.add(2);
        queue2.add(6);
        queue2.add(3);
        queue2.add(4);
        System.out.println("Can be arranged in increasing order? " + checkOrder(queue2)); // Output: No
    }
}
