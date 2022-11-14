//occurance of every character a-z at least once in string is panagram
public class panagramString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		boolean flag=false;
		String str="THE QUICK BROWN fox JUMPS OVER THE LAZY DOG";
		
		char[] ch=str.toCharArray();
		// convert to upper case
		for (int i = 0; i < ch.length; i++) {
            // here is the actual logic
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) ((int) ch[i] - 32);
            }
		}
		//s1=s1.replace(" ", "");
		//replace method logic
//		   char[] strArray = str.toCharArray();  
//	        StringBuffer s = new StringBuffer();  
//	        for (int i = 0; i < strArray.length; i++) {  
//	            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
//	                s.append(strArray[i]);  
//	            }  
//	        }  
//	        String noSpaceStr = s.toString(); 
//	        char[] ch=noSpaceStr.toCharArray();
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{if(ch[i]!=' ') {
			int index=ch[i]-65;
			ar[index]++;  //ar[19]++ --> 0++ --> 1++ --->2
			//ar[ch[i]-65]++;
		}}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
		System.out.println("It's pangram");
		}
	}


}
