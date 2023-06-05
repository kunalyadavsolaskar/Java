public class Solution_4 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(reverseWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        String reversed = reverseWords(s);
        System.out.println(reversed);
    }
}
