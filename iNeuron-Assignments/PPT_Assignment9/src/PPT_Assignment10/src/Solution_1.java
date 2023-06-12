public class Solution_1 {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        
        if (n <= 0 || n % 3 != 0) {
            return false;
        }
        
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        int n = 27;
        boolean result = isPowerOfThree(n);
        System.out.println(n + " is a power of three: " + result);
    }
}
