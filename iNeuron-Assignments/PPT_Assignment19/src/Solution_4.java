public class Solution_4 {
    public void moveZeroes(int[] nums) {
        int i = 0; // pointer to track non-zero elements
        int j = 0; // pointer to traverse the array

        while (j < nums.length) {
            if (nums[j] != 0) {
                // Swap non-zero element to the left side of the array
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        Solution_4 mover = new Solution_4();

        int[] nums = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        mover.moveZeroes(nums);
        printArray(nums); // Output: [1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0]
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
