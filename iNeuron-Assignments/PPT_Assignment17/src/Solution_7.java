import java.util.LinkedList;

public class Solution_7 {
    private LinkedList<Integer> queue;

    public Solution_7() {
        queue = new LinkedList<>();
    }

    public void pushFront(int val) {
        queue.addFirst(val);
    }

    public void pushMiddle(int val) {
        int middle = queue.size() / 2;
        queue.add(middle, val);
    }

    public void pushBack(int val) {
        queue.addLast(val);
    }

    public int popFront() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.removeFirst();
    }

    public int popMiddle() {
        if (queue.isEmpty()) {
            return -1;
        }
        int middle = (queue.size() - 1) / 2;
        return queue.remove(middle);
    }

    public int popBack() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.removeLast();
    }

    public static void main(String[] args) {
        Solution_7 queue = new Solution_7();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        System.out.println(queue.popFront());  // Output: 1
        System.out.println(queue.popMiddle()); // Output: 3
        System.out.println(queue.popBack());   // Output: 2
    }
}
