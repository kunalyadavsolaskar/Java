import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution_1 {
    public static int findFirstNonRepeatingChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            queue.offer(c);
        }

        while (!queue.isEmpty()) {
            char c = queue.peek();
            if (charCount.get(c) == 1) {
                return s.indexOf(c);
            }
            queue.poll();
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "leetcode";
        int result = findFirstNonRepeatingChar(input);
        System.out.println("First non-repeating character index: " + result);
    }
}
