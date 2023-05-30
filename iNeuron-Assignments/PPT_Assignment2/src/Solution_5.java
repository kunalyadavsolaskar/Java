import java.util.Arrays;

public class Solution_5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution_5 solution = new Solution_5();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Output: " + maxProduct);
    }
}
