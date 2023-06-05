public class Solution_1 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Create two arrays to store the mapping of characters
        char[] sMap = new char[256];
        char[] tMap = new char[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            
            if (sMap[sChar] != '\u0000') {
            
                if (sMap[sChar] != tChar) {
                    return false;
                }
            } else {
            
                if (tMap[tChar] != '\u0000') {
                    return false;
                }

                
                sMap[sChar] = tChar;
                tMap[tChar] = sChar;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = isIsomorphic(s, t);
        System.out.println(isIsomorphic);
    }
}
