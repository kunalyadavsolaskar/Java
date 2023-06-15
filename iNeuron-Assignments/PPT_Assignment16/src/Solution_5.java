import java.util.Stack;

public class Solution_5 {
    public static int reverseNumber(int number) {
        String numberStr = String.valueOf(number);
        Stack<Character> stack = new Stack<>();

        for (char c : numberStr.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedStr = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        String reversedNumStr = reversedStr.toString();
        return Integer.parseInt(reversedNumStr);
    }

    public static void main(String[] args) {
        int number1 = 365;
        System.out.println("Reversed number: " + reverseNumber(number1)); // Output: 563

        int number2 = 6899;
        System.out.println("Reversed number: " + reverseNumber(number2)); // Output: 9986
    }
}
