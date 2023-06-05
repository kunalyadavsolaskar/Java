public class Solution_2 {
    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);

            if (!isStrobogrammaticPair(leftChar, rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isStrobogrammaticPair(char c1, char c2) {
        switch (c1) {
            case '0':
                return c2 == '0';
            case '1':
                return c2 == '1';
            case '6':
                return c2 == '9';
            case '8':
                return c2 == '8';
            case '9':
                return c2 == '6';
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String num = "69";

        boolean isStrobogrammatic = isStrobogrammatic(num);
        System.out.println(isStrobogrammatic);
    }
}
