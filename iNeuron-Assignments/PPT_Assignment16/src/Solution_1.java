import java.util.*;

public class Solution_1 {
    public static int[] findNearestGreaterFrequency(int[] arr) {
        int[] result = new int[arr.length];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && frequencyMap.get(arr[i]) >= frequencyMap.get(stack.peek())) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 2, 1};
        int[] result1 = findNearestGreaterFrequency(arr1);
        System.out.println(Arrays.toString(result1)); // Output: [-1, -1, 1, 2, 2, 1, -1]

        int[] arr2 = {1, 1, 1, 2, 2, 2, 2, 11, 3, 3};
        int[] result2 = findNearestGreaterFrequency(arr2);
        System.out.println(Arrays.toString(result2)); // Output: [2, 2, 2, -1, -1, -1, -1, 3, -1, -1]
    }
}
