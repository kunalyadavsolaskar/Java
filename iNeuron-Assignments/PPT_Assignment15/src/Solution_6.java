import java.util.Stack;

public class Solution_6 {
    public static int evaluatePostfixExpression(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : postfixExpression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;

                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "231*+9-";
        int result = evaluatePostfixExpression(postfixExpression);
        System.out.println("Result: " + result);
    }
}
