import java.util.LinkedList;
import java.util.Queue;

public class Solution_5 {
    private Queue<Integer> requests;

    public Solution_5() {
        requests = new LinkedList<>();
    }

    public int ping(int t) {
        requests.offer(t); // Add the new request to the queue

        // Remove requests that are outside the time range [t - 3000, t]
        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
    }

    public static void main(String[] args) {
        Solution_5 recentCounter = new Solution_5();
        System.out.println(recentCounter.ping(1));     // Output: 1
        System.out.println(recentCounter.ping(100));   // Output: 2
        System.out.println(recentCounter.ping(3001));  // Output: 3
        System.out.println(recentCounter.ping(3002));  // Output: 3
    }
}
