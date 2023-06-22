import java.util.Arrays;

public class Solution_2 {
    public void sortColors(int[] nums) {
        int low = 0;        // Pointer for 0's (red)
        int mid = 0;        // Pointer for 1's (white)
        int high = nums.length - 1;  // Pointer for 2's (blue)

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution_2 sortColors = new Solution_2();

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors.sortColors(nums1);
        System.out.println(Arrays.toString(nums1));
        // Output: [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        sortColors.sortColors(nums2);
        System.out.println(Arrays.toString(nums2));
        // Output: [0, 1, 2]
    }
}
