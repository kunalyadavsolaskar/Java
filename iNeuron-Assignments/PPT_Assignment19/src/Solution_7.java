import java.util.*;

public class Solution_7 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        // Add elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check for elements in nums2 that exist in the set
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }

        // Convert the set to an array
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution_7 intersectionFinder = new Solution_7();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersect = intersectionFinder.intersection(nums1, nums2);
        printArray(intersect); // Output: [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        intersect = intersectionFinder.intersection(nums3, nums4);
        printArray(intersect); // Output: [9, 4]
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
