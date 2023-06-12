public class Solution_6 {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] < nums[right]) {
                // Array is not rotated, return the element at left
                return nums[left];
            }
            
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
                // Minimum element is at or to the left of mid
                right = mid;
            } else {
                // Minimum element is to the right of mid
                left = mid + 1;
            }
        }
        
        return nums[left];
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}
