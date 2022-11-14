import java.util.Arrays;
import java.util.Scanner;

public class anagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		System.out.println("Enter the second string");
		String s2=sc.nextLine();
		
		
//		s1=s1.replace(" ", "");
//		s2=s2.replace(" ", "");
		char[] strArray = s1.toCharArray();  
        StringBuffer str1 = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                str1.append(strArray[i]);  
            }  
        }  
        String noSpaceStr1 = str1.toString(); 
        char[] strArray1 = s2.toCharArray();  
        StringBuffer str2 = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray1[i] != ' ') && (strArray1[i] != '\t')) {  
                str2.append(strArray1[i]);  
            }  
        }  
        String noSpaceStr2 = str2.toString(); 
        
        
        
		char[] ch1=noSpaceStr1.toCharArray();
		char[] ch2=noSpaceStr2.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
          //uppercase conversion
            if (ch1[i] >= 'a' && ch1[i] <= 'z') {
                    ch1[i] = (char) ((int) ch1[i] - 32);
            }
		}
		for (int i = 0; i < ch2.length; i++) {
            // here is the actual logic
            if (ch2[i] >= 'a' && ch2[i] <= 'z') {
                    ch2[i] = (char) ((int) ch2[i] - 32);
            }
		}
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
		
		
		
		
	}

}
