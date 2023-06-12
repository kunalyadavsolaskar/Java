import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_5 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> intersection = new ArrayList<>();
        
        for (int num : nums1) {
            if (binarySearch(nums2, num) && !intersection.contains(num)) {
                intersection.add(num);
            }
        }
        
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
    
    private static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        
        int[] result = intersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
