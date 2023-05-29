public class Solution_5 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;  // Index of last element in nums1
        int index2 = n - 1;  // Index of last element in nums2
        int mergedIndex = m + n - 1;  // Index of last element in merged array
        
        // Merge elements from the end
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] >= nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }
        
        // Copy remaining elements from nums2 to nums1
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }

    public static void main(String[] args) {
        Solution_5 merger = new Solution_5();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        merger.merge(nums1, m, nums2, n);
        
        System.out.print("Result: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
