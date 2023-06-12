public class Solution_3 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int result = factorial(N);
        System.out.println("Factorial of " + N + " is: " + result);
    }
}
