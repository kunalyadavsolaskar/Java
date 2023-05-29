public class Solution_7 {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        
        // Move all non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }
        
        // Fill the remaining elements with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        Solution_7 mover = new Solution_7();
        int[] nums = {0, 1, 0, 3, 12};
        
        mover.moveZeroes(nums);
        
        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
