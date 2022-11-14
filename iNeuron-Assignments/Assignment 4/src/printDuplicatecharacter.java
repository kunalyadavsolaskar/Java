
import java.util.Scanner;

public class printDuplicatecharacter {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char []s=str.toCharArray();
		
		 for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (s[i] == s[j]) {
	               System.out.print(s[j] + " ");
	               break;
	            }
	         }
	      }
	}
}
