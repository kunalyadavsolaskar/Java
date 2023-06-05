import java.util.*;

public class Solution_6 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        
        int[] pCount = new int[26];
        int[] windowCount = new int[26]; 
        
    
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int windowSize = p.length();
        
      
        for (int i = 0; i < windowSize; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }
        
        // Check if the initial window is an anagram of p
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }
        
        // Slide the window and check for anagrams
        for (int i = windowSize; i < s.length(); i++) {
            windowCount[s.charAt(i - windowSize) - 'a']--; // Remove the leftmost character
            windowCount[s.charAt(i) - 'a']++; // Add the current character
            
            // Check if the current window is an anagram of p
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - windowSize + 1);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);
        System.out.println(indices);
    }
}
