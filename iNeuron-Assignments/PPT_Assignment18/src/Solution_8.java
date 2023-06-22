import java.util.Stack;

public class Solution_8 {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] minValues = new int[n];
        minValues[0] = nums[0];

        for (int i = 1; i < n; i++) {
            minValues[i] = Math.min(minValues[i - 1], nums[i]);
        }

        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > minValues[j]) {
                while (!stack.isEmpty() && stack.peek() <= minValues[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution_8 pattern = new Solution_8();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(pattern.find132pattern(nums1));
        // Output: false

        int[] nums2 = {3, 1, 4, 2};
        System.out.println(pattern.find132pattern(nums2));
        // Output: true

        int[] nums3 = {-1, 3, 2, 0};
        System.out.println(pattern.find132pattern(nums3));
        // Output: true
    }
}
