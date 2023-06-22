import java.util.HashSet;

public class Solution_5 {
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
        Solution_5 cd = new Solution_5();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(cd.containsDuplicate(nums1));
        // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(cd.containsDuplicate(nums2));
        // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(cd.containsDuplicate(nums3));
        // Output: true
    }
}
