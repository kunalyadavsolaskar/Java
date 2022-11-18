package Programs1;

import java.util.Scanner;

public class swapTwoNoWithoutThridVar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two number");
	int x=sc.nextInt();
	int y=sc.nextInt();
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swapping \nX = "+x+"\nY = "+y);
}
}
