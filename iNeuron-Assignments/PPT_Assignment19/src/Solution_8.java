import java.util.*;

public class Solution_8 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersect = new ArrayList<>();

        // Count the occurrences of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for elements in nums2 and decrement the count in the map
        // Add the element to the intersection list if count > 0
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersect.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert the intersection list to an array
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution_8 intersectionFinder = new Solution_8();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersect = intersectionFinder.intersect(nums1, nums2);
        printArray(intersect); // Output: [2, 2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        intersect = intersectionFinder.intersect(nums3, nums4);
        printArray(intersect); // Output: [4, 9]
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
