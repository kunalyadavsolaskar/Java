import java.util.LinkedList;
import java.util.Queue;

public class Solution_6 {
    public static int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        // Fill the queue with friend numbers
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            // Remove the k-1 friends from the front of the queue and add them to the end
            for (int i = 0; i < k - 1; i++) {
                int friend = queue.poll();
                queue.offer(friend);
            }

            // Remove the k-th friend from the front of the queue
            queue.poll();
        }

        // Return the last remaining friend (the winner)
        return queue.peek();
    }

    public static void main(String[] args) {
        int n1 = 5, k1 = 2;
        int winner1 = findTheWinner(n1, k1);
        System.out.println("Winner: " + winner1);

        int n2 = 6, k2 = 5;
        int winner2 = findTheWinner(n2, k2);
        System.out.println("Winner: " + winner2);
    }
}
