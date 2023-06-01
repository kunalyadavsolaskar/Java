public class Solution_1 {
    public static int[][] convertTo2D(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        
        // Check if the total number of elements matches the size of the 2D array
        if (original.length != m * n) {
            return new int[0][0]; // Return an empty 2D array if not possible
        }
        
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        
        int[][] convertedArray = convertTo2D(original, m, n);
        
        // Printing the converted 2D array
        for (int i = 0; i < convertedArray.length; i++) {
            for (int j = 0; j < convertedArray[0].length; j++) {
                System.out.print(convertedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
