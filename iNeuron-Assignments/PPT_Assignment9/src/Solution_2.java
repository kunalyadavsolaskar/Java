public class Solution_2 {
public static int calculateSum(int n) {
if (n == 1) {
return 1;
} else {
return n + calculateSum(n - 1);
}
}

public static void main(String[] args) {
int n1 = 3;
int n2 = 5;

int sum1 = calculateSum(n1);
int sum2 = calculateSum(n2);

System.out.println("Sum of the first " + n1 + " natural numbers: " + sum1); // Output: 6
System.out.println("Sum of the first " + n2 + " natural numbers: " + sum2); // Output: 15
}
}
