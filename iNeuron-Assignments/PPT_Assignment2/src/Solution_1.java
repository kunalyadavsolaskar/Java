import java.util.Arrays;

public class Solution_1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Add the minimum value of each pair
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        Solution_1 arrayPairSum = new Solution_1();
        int maxSum = arrayPairSum.arrayPairSum(nums);
        System.out.println("Output: " + maxSum);
    }
}
