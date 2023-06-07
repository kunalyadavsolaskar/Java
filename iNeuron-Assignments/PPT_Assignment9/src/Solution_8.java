public class Solution_8 {
    public static int findProduct(int[] arr, int index) {
        if (index == arr.length) {
            return 1;
        } else {
            return arr[index] * findProduct(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = findProduct(arr, 0);
        System.out.println("Product of array elements is: " + result);
    }
}
