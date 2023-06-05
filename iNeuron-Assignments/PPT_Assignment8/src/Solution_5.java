public class Solution_5 {
    public static int compress(char[] chars) {
        int n = chars.length;
        int writePtr = 0; // Position to write the compressed characters
        int count = 1; // Count of consecutive repeating characters

        for (int readPtr = 1; readPtr < n; readPtr++) {
            if (chars[readPtr] == chars[readPtr - 1]) {
                count++;
            } else {
                chars[writePtr++] = chars[readPtr - 1]; // Write the character

                // Write the count if it is greater than 1
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[writePtr++] = c; // Write each digit of the count
                    }
                }

                count = 1; // Reset the count for the new character
            }
        }

        // Write the last character and its count (if greater than 1)
        chars[writePtr++] = chars[n - 1];
        if (count > 1) {
            String countStr = String.valueOf(count);
            for (char c : countStr.toCharArray()) {
                chars[writePtr++] = c;
            }
        }

        return writePtr; // Return the new length of the array
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);

        System.out.println(newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
