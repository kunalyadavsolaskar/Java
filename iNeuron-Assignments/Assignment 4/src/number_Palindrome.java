import java.util.Scanner;

public class number_Palindrome {
	public static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x= x/10;
        }
        return rev==original ? true : false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome");
		int num=sc.nextInt();//2552
		boolean flag=isPalindrome(num);
		if (flag==true) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}

}
