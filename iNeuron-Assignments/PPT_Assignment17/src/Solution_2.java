import java.util.Deque;
import java.util.LinkedList;

public class Solution_2 {
    public static int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        // Calculate the maximum sum using Kadane's algorithm for a linear subarray
        int linearMaxSum = kadaneMaxSum(nums);

        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Negate the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = -nums[i];
        }

        // Calculate the maximum sum using Kadane's algorithm for a linear subarray in the negated array
        int negatedMaxSum = kadaneMaxSum(nums);

        // Calculate the circular max sum by subtracting the negated max sum from the total sum
        int circularMaxSum = totalSum + negatedMaxSum;

        // Return the maximum of linearMaxSum and circularMaxSum
        return Math.max(linearMaxSum, circularMaxSum);
    }

    private static int kadaneMaxSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        int result = maxSubarraySumCircular(nums);
        System.out.println("Maximum circular subarray sum: " + result);
    }
}
