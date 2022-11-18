package Programs1;

import java.util.Scanner;

public class FactorialofNumber {
	public static int fac(int n){
		if(n==1)
			return 1;
		else
		return (n*fac(n-1));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number  ");
		try (Scanner scanner = new Scanner(System.in)) {
			int n=scanner.nextInt();
			System.out.println(fac(n));}

	}

}
