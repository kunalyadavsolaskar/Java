public class Solution_5 {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            int maxRest = findMax(arr, index + 1);
            return Math.max(arr[index], maxRest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int result = findMax(arr, 0);
        System.out.println("Maximum element in the array is: " + result);
    }
}
