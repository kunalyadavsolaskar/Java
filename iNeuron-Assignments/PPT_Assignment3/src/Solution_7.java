import java.util.ArrayList;
import java.util.List;

public class Solution_7 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
       
        if (nums[0] > lower) {
            result.add(getRange(lower, nums[0] - 1));
        }
        
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                result.add(getRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }
        
       
        if (nums[nums.length - 1] < upper) {
            result.add(getRange(nums[nums.length - 1] + 1, upper));
        }
        
        return result;
    }
    
    private static String getRange(int start, int end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println("Missing ranges:");
        for (String range : result) {
            System.out.println(range);
        }
    }
}
