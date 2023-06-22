import java.util.Arrays;

public class Solution_7 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLen = Math.max(maxLen, dp[i]);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution_7 lis = new Solution_7();

        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lis.lengthOfLIS(nums1));
        // Output: 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(lis.lengthOfLIS(nums2));
        // Output: 4

        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(lis.lengthOfLIS(nums3));
        // Output: 1
    }
}
