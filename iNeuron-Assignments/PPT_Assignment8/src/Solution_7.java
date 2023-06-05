import java.util.Stack;

public class Solution_7 {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentCount = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentCount = currentCount * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString.toString());
                currentCount = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        Solution_7 decoder = new Solution_7();
        String s = "3[a]2[bc]";
        String decodedString = decoder.decodeString(s);
        System.out.println(decodedString);
    }
}
