import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    /** Initialize your data structure here. */
    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int element = q1.poll();
        swapQueues();
        return element;
    }

    /** Get the top element. */
    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int element = q1.poll();
        q2.offer(element);
        swapQueues();
        return element;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    /** Swap the names of q1 and q2. */
    private void swapQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}
