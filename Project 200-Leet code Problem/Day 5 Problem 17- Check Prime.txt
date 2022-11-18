package Programs1;

import java.util.Scanner;

public class checkPrime {
public static  boolean isPrime(int n) {
	if(n==0||n==1)return false;
	if (n==2) return true;
	for (int i=2;i<n/2;i++) {
			if(n%2==0) return false;
	}
	
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number  ");
		try (Scanner scanner = new Scanner(System.in)) {
			int n=scanner.nextInt();
			System.out.println((isPrime(n))? "Prime Number":"Not Prime Number");
	}

}}
