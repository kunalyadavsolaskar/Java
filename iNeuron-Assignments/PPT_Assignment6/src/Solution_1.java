import java.util.*;

public class Solution_1 {
    public static int[] reconstructPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        List<Integer> available = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            available.add(i);
        }

        int index = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = available.remove(0);
            } else {
                perm[i] = available.remove(available.size() - 1);
            }
        }

        perm[n] = available.get(0);

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = reconstructPermutation(s);

        System.out.println("Reconstructed permutation: " + Arrays.toString(perm));
    }
}
