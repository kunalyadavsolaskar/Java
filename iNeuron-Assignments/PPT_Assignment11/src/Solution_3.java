public class Solution_3 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result = missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
}
