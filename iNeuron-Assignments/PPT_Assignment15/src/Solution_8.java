import java.util.Stack;

public class Solution_8 {
    public static int trap(int[] height) {
        int water = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < height.length) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int bottom = stack.pop();
                if (!stack.isEmpty()) {
                    int distance = i - stack.peek() - 1;
                    int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[bottom];
                    water += distance * boundedHeight;
                }
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water: " + trap(height1)); // Output: 6

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped water: " + trap(height2)); // Output: 9
    }
}
