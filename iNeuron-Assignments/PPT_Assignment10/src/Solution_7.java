import java.util.*;

public class Solution_7 {
    public static void printPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str.toCharArray(), 0, permutations);
        for (String permutation : permutations) {
            System.out.print(permutation + " ");
        }
    }

    private static void permute(char[] arr, int index, List<String> permutations) {
        if (index == arr.length - 1) {
            permutations.add(String.valueOf(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                permute(arr, index + 1, permutations);
                swap(arr, index, i);
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abb";
        System.out.println("Permutations of the string '" + str + "':");
        printPermutations(str);
    }
}
