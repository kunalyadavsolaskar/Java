public class Solution_5 {
    public static int arrangeCoins(int n) {
        int rows = 0;
        
        while (n >= rows + 1) {
            rows++;
            n -= rows;
        }
        
        return rows;
    }
    
    public static void main(String[] args) {
        int n = 5;
        
        int completeRows = arrangeCoins(n);
        
        System.out.println("Number of complete rows: " + completeRows);
    }
}
