import java.util.Stack;

class Solution_4 {
    public static void reverseStack(Stack<Integer> St) {
        if (St.isEmpty() || St.size() == 1) {
            return;
        }

        int temp = St.pop();
        reverseStack(St);
        insertAtBottom(St, temp);
    }

    public static void insertAtBottom(Stack<Integer> St, int value) {
        if (St.isEmpty()) {
            St.push(value);
            return;
        }

        int temp = St.pop();
        insertAtBottom(St, value);
        St.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> St = new Stack<>();
        St.push(3);
        St.push(2);
        St.push(1);
        St.push(7);
        St.push(6);

        System.out.println("Original Stack: " + St);
        reverseStack(St);
        System.out.println("Reversed Stack: " + St);
    }
}
