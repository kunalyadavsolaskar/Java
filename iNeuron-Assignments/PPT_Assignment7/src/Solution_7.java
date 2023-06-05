public class Solution_7 {
    public static boolean backspaceCompare(String s, String t) {
        String processedS = processString(s);
        String processedT = processString(t);
        return processedS.equals(processedT);
    }

    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean isEqual = backspaceCompare(s, t);
        System.out.println(isEqual);
    }
}
