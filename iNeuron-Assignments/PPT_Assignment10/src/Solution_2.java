public class Solution_2 {
    public static int lastRemaining(int n) {
        return remainingHelper(n, true);
    }

    public static int remainingHelper(int n, boolean leftToRight) {
        if (n == 1) {
            return 1;
        }
        
        if (leftToRight) {
            return 2 * remainingHelper(n / 2, false);
        } else {
            if (n % 2 == 1) {
                return 2 * remainingHelper(n / 2, true);
            } else {
                return 2 * remainingHelper(n / 2, true) - 1;
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int result = lastRemaining(n);
        System.out.println("The last remaining number in the array is: " + result);
    }
}
