public class Solution_2 {
    public static int arrangeCoins(int n) {
        int completeRows = 0;
        int coins = n;
        int row = 1;

        while (coins >= row) {
            coins -= row;
            row++;
            completeRows++;
        }

        return completeRows;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
