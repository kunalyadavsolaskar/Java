import java.util.Stack;

class Solution_5 {
    public static String reverseString(String S) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();

        // Pop characters from the stack and append them to the new string
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        System.out.println("Original String: " + S);
        System.out.println("Reversed String: " + reverseString(S));
    }
}
