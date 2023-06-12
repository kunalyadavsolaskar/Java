import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_8 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));

        int[] nums3 = { 4, 9, 5 };
        int[] nums4 = { 9, 4, 9, 8, 4 };
        int[] result2 = intersect(nums3, nums4);
        System.out.println(Arrays.toString(result2));
    }
}
