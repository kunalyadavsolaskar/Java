public class Solution_4 {
    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int P = 2;
        long result = power(N, P);
        System.out.println(N + " raised to the power " + P + " is: " + result);
    }
}
