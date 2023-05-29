public class Solution_4 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Increment the least significant digit by 1
        digits[n - 1] += 1;
        
        // Carry over if there's a need
        int carry = digits[n - 1] / 10;
        digits[n - 1] %= 10;
        
        // Iterate through the remaining digits
        for (int i = n - 2; i >= 0 && carry > 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }
        
        return digits;
    }

    public static void main(String[] args) {
        Solution_4 incrementer = new Solution_4();
        int[] digits = {1, 2, 3};
        int[] result = incrementer.plusOne(digits);
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
