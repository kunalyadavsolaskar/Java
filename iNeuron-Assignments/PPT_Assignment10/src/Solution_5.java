public class Solution_5 {
    public static int countContiguousSubstrings(String str) {
        return countSubstringsHelper(str, 0, str.length() - 1);
    }

    private static int countSubstringsHelper(String str, int start, int end) {
        if (start == end) {
            return 1;
        }

        int count = 0;

        if (str.charAt(start) == str.charAt(end)) {
            count++;
        }

        if (start + 1 < end) {
            count += countSubstringsHelper(str, start + 1, end);
            count += countSubstringsHelper(str, start, end - 1);
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int count = countContiguousSubstrings(str);
        System.out.println("Count of contiguous substrings in '" + str + "' is: " + count);
    }
}
