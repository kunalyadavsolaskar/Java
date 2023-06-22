import java.util.Arrays;
import java.util.Comparator;

public class Solution_6 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        // Sort the balloons based on their end points
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1; // At least one arrow is needed
        int end = points[0][1];

        // Iterate over the balloons and check if the current balloon can be burst with the same arrow
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                // Balloon cannot be burst with the same arrow, so a new arrow is needed
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }

    public static void main(String[] args) {
        Solution_6 ma = new Solution_6();

        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(ma.findMinArrowShots(points1));
        // Output: 2

        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(ma.findMinArrowShots(points2));
        // Output: 4

        int[][] points3 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(ma.findMinArrowShots(points3));
        // Output: 2
    }
}
