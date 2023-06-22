public class Solution_6 {
    public int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for merged array

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        Solution_6 merger = new Solution_6();

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = merger.merge(arr1, arr2);
        printArray(merged); // Output: {1, 2, 3, 4, 4, 5, 6, 8}
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
