import java.util.Scanner;

public class numberofCVS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int constant=0,vowel=0,spc=0,digit=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowel++;
			}
			else if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
				constant++;
			}
			else if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
				digit++;
			}
			else if(str.charAt(i)!=' '){
				spc++;
			}
			
		}
		System.out.println("Vowels: "+vowel+"\nConstants: "+constant+""
				+ "\nDigit: "+digit+"\nSpecial Character: "+spc);
	}

}
