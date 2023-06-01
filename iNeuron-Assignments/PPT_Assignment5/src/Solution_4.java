import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_4 {
    public static List<List<Integer>> findDistinctElements(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();

        for (int num : nums1) {
            if (!set2.contains(num)) {
                distinctNums1.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num)) {
                distinctNums2.add(num);
            }
        }

        answer.add(distinctNums1);
        answer.add(distinctNums2);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> answer = findDistinctElements(nums1, nums2);

        System.out.println("Distinct integers in nums1 not present in nums2: " + answer.get(0));
        System.out.println("Distinct integers in nums2 not present in nums1: " + answer.get(1));
    }
}
