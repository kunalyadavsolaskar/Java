public class Solution_7 {
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        // Find the leftmost occurrence of the target value
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                start = mid;
                right = mid - 1; // Move right pointer to search for leftmost occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Find the rightmost occurrence of the target value
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                end = mid;
                left = mid + 1; // Move left pointer to search for rightmost occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[] { start, end };
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("Starting position: " + result[0]);
        System.out.println("Ending position: " + result[1]);
    }
}
