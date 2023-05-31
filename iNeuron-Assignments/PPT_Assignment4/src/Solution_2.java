import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_2 {
    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> distinct1 = new ArrayList<>();
        List<Integer> distinct2 = new ArrayList<>();
        
       
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinct1.add(num);
            }
        }
        
        // Find distinct integers in nums2 but not in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinct2.add(num);
            }
        }
        
        result.add(distinct1);
        result.add(distinct2);
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        
        List<List<Integer>> result = findDistinctIntegers(nums1, nums2);
        System.out.println("Distinct integers in nums1: " + result.get(0));
        System.out.println("Distinct integers in nums2: " + result.get(1));
    }
}
