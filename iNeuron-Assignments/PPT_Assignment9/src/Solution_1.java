public class Solution_1 {
public static boolean isPowerOfTwo(int n) {
if (n == 1) {
return true;
} else if (n <= 0 || n % 2 != 0) {
return false;
} else {
return isPowerOfTwo(n / 2);
}
}

public static void main(String[] args) {
int n1 = 1;
int n2 = 16;
int n3 = 3;

System.out.println(isPowerOfTwo(n1)); // Output: true
System.out.println(isPowerOfTwo(n2)); // Output: true
System.out.println(isPowerOfTwo(n3)); // Output: false
}
}
