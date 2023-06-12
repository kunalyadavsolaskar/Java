public class Solution_6 {
    public static int findNthTerm(int a, int d, int N) {
        if (N == 1) {
            return a;
        } else {
            return findNthTerm(a + d, d, N - 1);
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int d = 1;
        int N = 5;
        int result = findNthTerm(a, d, N);
        System.out.println("The " + N + "th term of the series is: " + result);
    }
}
