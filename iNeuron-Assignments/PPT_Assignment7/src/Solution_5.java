public class Solution_5 {
    public static String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);
            reverse(charArray, start, end);
        }

        return new String(charArray);
    }

    private static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        String reversed = reverseStr(s, k);
        System.out.println(reversed);
    }
}
