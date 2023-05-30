import java.util.Arrays;

public class Solution_8 {
    public int minScore(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int minScore = nums[n - 1] - nums[0];

        for (int i = 0; i < n - 1; i++) {
            int high = Math.max(nums[i] + k, nums[n - 1] - k);
            int low = Math.min(nums[i + 1] - k, nums[0] + k);
            minScore = Math.min(minScore, high - low);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        Solution_8 solution = new Solution_8();
        int minScore = solution.minScore(nums, k);
        System.out.println("Output: " + minScore);
    }
}
