import java.util.Arrays;

public class Solution_8 {
    public static boolean canAttendAllMeetings(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
       
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = canAttendAllMeetings(intervals);
        System.out.println("Can attend all meetings: " + result);
    }
}
