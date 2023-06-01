import java.util.*;

public class Solution_8 {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // Return an empty array if the length is not even
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed); // Sort the changed array

        int[] original = new int[changed.length / 2];
        int index = 0;

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];

            if (countMap.getOrDefault(num, 0) == 0) {
                continue; // Skip if the count of the number is already used
            }

            int doubledNum = num * 2;

            if (countMap.getOrDefault(doubledNum, 0) == 0) {
                return new int[0]; // Return an empty array if doubledNum is not found
            }

            original[index++] = num;
            countMap.put(num, countMap.get(num) - 1);
            countMap.put(doubledNum, countMap.get(doubledNum) - 1);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        System.out.println("Original array: " + Arrays.toString(original));
    }
}
