import java.util.Stack;

public class Solution_7 {
    public static int countRemainingWords(String[] words) {
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && stack.peek().equals(word)) {
                stack.pop(); // Destroy the similar word
            } else {
                stack.push(word); // Add the word to the stack
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String[] words1 = {"ab", "aa", "aa", "bcd", "ab"};
        System.out.println("Remaining words: " + countRemainingWords(words1)); // Output: 3

        String[] words2 = {"tom", "jerry", "jerry", "tom"};
        System.out.println("Remaining words: " + countRemainingWords(words2)); // Output: 0
    }
}
