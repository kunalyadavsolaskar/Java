public class Solution_8 {
    public static int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isConsonant(ch)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks portal";
        int consonantCount = countConsonants(str);
        System.out.println("Total number of consonants: " + consonantCount);
    }
}
