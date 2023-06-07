import java.util.ArrayList;
import java.util.List;

public class Solution_7 {
    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        permuteHelper(str.toCharArray(), 0, result);
        return result;
    }

    private static void permuteHelper(char[] arr, int index, List<String> result) {
        if (index == arr.length - 1) {
            result.add(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permuteHelper(arr, index + 1, result);
            swap(arr, index, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String S = "ABC";
        List<String> permutations = permute(S);
        System.out.println("Permutations of " + S + ":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
