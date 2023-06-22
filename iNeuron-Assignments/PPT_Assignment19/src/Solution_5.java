public class Solution_5 {
    public void rearrange(int[] nums) {
        int i = 0; // pointer for positive numbers
        int j = 1; // pointer for negative numbers

        while (i < nums.length && j < nums.length) {
            // Find the next positive number
            while (i < nums.length && nums[i] < 0) {
                i += 2;
            }

            // Find the next negative number
            while (j < nums.length && nums[j] >= 0) {
                j += 2;
            }

            // Swap the positive and negative numbers
            if (i < nums.length && j < nums.length) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Solution_5 rearranger = new Solution_5();

        int[] nums = {1, 2, 3, -4, -1, 4};
        rearranger.rearrange(nums);
        printArray(nums); // Output: {-4, 1, -1, 2, 3, 4}
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
