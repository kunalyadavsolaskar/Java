public class Solution_3 {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Step 1: Find the peak
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check if the peak is at the start or end of the array
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Step 2: Check the descending part of the array
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 3: If all elements are properly visited, it is a valid mountain array
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        boolean result = validMountainArray(arr);

        System.out.println("Result: " + result);
    }
}
