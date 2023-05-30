import java.util.HashSet;
import java.util.Set;

public class Solution_2 {
    public int maxCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        Set<Integer> uniqueCandyTypes = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandyTypes.add(candy);

            if (uniqueCandyTypes.size() == maxCandies) {
                break; // Reached the maximum number of different types
            }
        }

        return uniqueCandyTypes.size();
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Solution_2 maxCandies = new Solution_2();
        int maxCount = maxCandies.maxCandies(candyType);
        System.out.println("Output: " + maxCount);
    }
}
