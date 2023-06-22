import java.util.LinkedList;
import java.util.Queue;

public class Solution_3 {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Queue<Integer> sandwichStack = new LinkedList<>();

        // Fill the queues
        for (int student : students) {
            studentQueue.offer(student);
        }
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichStack.offer(sandwiches[i]);
        }

        int consecutiveFailures = 0; // Tracks the number of consecutive students unable to eat

        while (!studentQueue.isEmpty() && consecutiveFailures < studentQueue.size()) {
            int frontStudent = studentQueue.poll();
            int topSandwich = sandwichStack.peek();

            if (frontStudent == topSandwich) {
                sandwichStack.poll();
                consecutiveFailures = 0; // Reset consecutiveFailures since a student got a preferred sandwich
            } else {
                studentQueue.offer(frontStudent);
                consecutiveFailures++;
            }
        }

        return studentQueue.size();
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        int result = countStudents(students, sandwiches);
        System.out.println("Number of students unable to eat: " + result);
    }
}
