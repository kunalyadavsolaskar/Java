package helloworld;

import java.util.Scanner;

public class helloworld {

	
	// Driver Code
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		double s =sc.nextDouble();
		if(s<2000) {
			System.out.println(String.format("%.1f", s)+" is too low");
		}
		else if(s>75000) {
			System.out.println(String.format("%.1f", s)+" exceeds the limit");
		}
		else {
			double x=s/10;
			System.out.println(String.format("%.1f", x));
		}
		
	}
}
