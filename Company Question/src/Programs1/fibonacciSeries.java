package Programs1;


import java.util.Scanner;

public class fibonacciSeries {
	public static void fib(int n) {
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Position of Number till you want series: ");
		try (Scanner scanner = new Scanner(System.in)) {
			int n=scanner.nextInt();
			fib(n);
		}
		

	}

}
