import java.util.HashMap;
import java.util.Map;

public class Solution_3 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int longestSubsequenceLength = 0;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (countMap.containsKey(num + 1)) {
                int currentLength = countMap.get(num) + countMap.get(num + 1);
                longestSubsequenceLength = Math.max(longestSubsequenceLength, currentLength);
            }
        }

        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Solution_3 solution = new Solution_3();
        int longestLength = solution.findLHS(nums);
        System.out.println("Output: " + longestLength);
    }
}
