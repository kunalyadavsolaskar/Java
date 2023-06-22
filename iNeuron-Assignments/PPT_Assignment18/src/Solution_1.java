import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution_1 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // Sort intervals based on the start time

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        Solution_1 mergeIntervals = new Solution_1();
        
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals1 = mergeIntervals.merge(intervals1);
        System.out.println(Arrays.deepToString(mergedIntervals1));
        // Output: [[1, 6], [8, 10], [15, 18]]
        
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] mergedIntervals2 = mergeIntervals.merge(intervals2);
        System.out.println(Arrays.deepToString(mergedIntervals2));
        // Output: [[1, 5]]
    }
}
