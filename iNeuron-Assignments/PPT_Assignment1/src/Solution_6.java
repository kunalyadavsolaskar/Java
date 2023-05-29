import java.util.HashSet;

public class Solution_6 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution_6 checker = new Solution_6();
        int[] nums = {1, 2, 3, 1};
        
        boolean result = checker.containsDuplicate(nums);
        
        System.out.println("Result: " + result);
    }
}
