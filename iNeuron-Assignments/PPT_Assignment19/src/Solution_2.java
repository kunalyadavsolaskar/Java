import java.util.ArrayList;
import java.util.List;

public class Solution_2 {
    private int[] count; // Array to store the count of smaller numbers

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        int[] indexes = new int[n]; // Array to store the indexes of the numbers

        // Initialize the indexes array
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        mergeSort(nums, indexes, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(count[i]);
        }

        return result;
    }

    private void mergeSort(int[] nums, int[] indexes, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, indexes, start, mid);
        mergeSort(nums, indexes, mid + 1, end);

        merge(nums, indexes, start, mid, end);
    }

    private void merge(int[] nums, int[] indexes, int start, int mid, int end) {
        int[] tempIndexes = new int[end - start + 1];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int mergedIndex = 0;
        int smallerCount = 0; // Count of smaller numbers on the right side of the merged array

        while (leftIndex <= mid && rightIndex <= end) {
            if (nums[indexes[rightIndex]] < nums[indexes[leftIndex]]) {
                tempIndexes[mergedIndex] = indexes[rightIndex];
                smallerCount++;
                rightIndex++;
            } else {
                tempIndexes[mergedIndex] = indexes[leftIndex];
                count[indexes[leftIndex]] += smallerCount;
                leftIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex <= mid) {
            tempIndexes[mergedIndex] = indexes[leftIndex];
            count[indexes[leftIndex]] += smallerCount;
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex <= end) {
            tempIndexes[mergedIndex] = indexes[rightIndex];
            rightIndex++;
            mergedIndex++;
        }

        System.arraycopy(tempIndexes, 0, indexes, start, end - start + 1);
    }

    public static void main(String[] args) {
        Solution_2 counter = new Solution_2();

        int[] nums1 = {5, 2, 6, 1};
        List<Integer> result1 = counter.countSmaller(nums1);
        System.out.println(result1); // Output: [2, 1, 1, 0]

        int[] nums2 = {-1};
        List<Integer> result2 = counter.countSmaller(nums2);
        System.out.println(result2); // Output: [0]

        int[] nums3 = {-1, -1};
        List<Integer> result3 = counter.countSmaller(nums3);
        System.out.println(result3); // Output: [0, 0]
    }
}
