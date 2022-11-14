import java.util.Scanner;

public class uniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char []s=str.toCharArray();
		boolean flag=false;
		 for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (s[i] == s[j]) {
	               flag=true;
	               break;
	            }
	         }
	      }
		 if (flag) {
			System.out.println("Repetation of character in string");
		}
		 else {
			System.out.println("Unique character string");
		}

	}

}
