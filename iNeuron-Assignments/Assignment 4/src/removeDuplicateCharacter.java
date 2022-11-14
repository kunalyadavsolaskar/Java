import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateCharacter {
	static String removeDuplicate(char str[],int n) {
		 int index = 0;
	        for (int i = 0; i < n; i++)
	        {
	            int j;
	            for (j = 0; j < i; j++)
	            {//System.out.println(i+" "+j);
	            
	                if (str[i] == str[j])
	                {
	                    break;
	                }
	            }
	           
	            if (j == i)
	            {// System.out.println(i+" "+j);
	                str[index++] = str[i];
	            }
	        }
	        return String.valueOf(Arrays.copyOf(str, index));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char []s=str.toCharArray();
		int len=str.length();
		System.out.println(removeDuplicate(s,len));
	}

}
