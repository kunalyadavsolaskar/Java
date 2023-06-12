public class Solution_4 {
    public static int findDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countOccurrences(nums, mid);
            
            if (count > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private static int countOccurrences(int[] nums, int target) {
        int count = 0;
        
        for (int num : nums) {
            if (num <= target) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int repeatedNumber = findDuplicate(nums);
        System.out.println("Repeated number: " + repeatedNumber);
    }
}
