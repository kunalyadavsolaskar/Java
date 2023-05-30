import java.util.Arrays;

public class Solution_5 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
      
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
           
                digits[i]++;
                return digits;
            }
            
           
            digits[i] = 0;
        }
       
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        
        return newDigits;
    }
    
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println("Original digits: " + Arrays.toString(digits));
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
