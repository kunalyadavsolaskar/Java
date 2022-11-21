package Programs1;

import java.util.Scanner;

public class amstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while (temp!=0) {
			int x=temp%10;
		
			temp=temp/10;
			
			sum=sum+(x*x*x);
		}
		if (sum==n) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not Amstrong Number");
		}

	}

}
