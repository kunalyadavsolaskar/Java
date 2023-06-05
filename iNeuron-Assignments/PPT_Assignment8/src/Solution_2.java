import java.util.Stack;

public class Solution_2 {
    public static boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                leftStack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else { // c == ')'
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            int leftIndex = leftStack.pop();
            int starIndex = starStack.pop();

            if (leftIndex > starIndex) {
                return false;
            }
        }

        return leftStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";

        boolean isValid = checkValidString(s);
        System.out.println(isValid);
    }
}
