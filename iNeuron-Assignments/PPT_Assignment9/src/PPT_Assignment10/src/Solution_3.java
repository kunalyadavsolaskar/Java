import java.util.ArrayList;
import java.util.List;

public class Solution_3 {
    public static List<String> printSubsets(String set) {
        List<String> result = new ArrayList<>();
        printSubsetsHelper(set, "", 0, result);
        return result;
    }

    private static void printSubsetsHelper(String set, String current, int index, List<String> result) {
        if (index == set.length()) {
            result.add(current);
            return;
        }

        printSubsetsHelper(set, current, index + 1, result); // Exclude current character
        printSubsetsHelper(set, current + set.charAt(index), index + 1, result); // Include current character
    }

    public static void main(String[] args) {
        String set = "abc";
        List<String> subsets = printSubsets(set);
        System.out.println("Subsets of " + set + ":");
        for (String subset : subsets) {
            System.out.println(subset);
        }
    }
}
