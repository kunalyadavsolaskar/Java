package pattern;

public class patternStarHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1; i<=n; i++)
	     {
	         for(int j=1; j<=n-i+1; j++)
	         {
	             System.out.print("*");
	         } 
	         for(int k=1; k<=2*i-2; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=n-i+1; j++)
	         {
	             System.out.print("*");
	         } 
	         System.out.println();
	     }
	     for(int i=n; i>=1; i--)
	     {
	    	 for(int j=1;j<=2*n;j++) {
	    		 if(j==1||i==1) {
					System.out.print("*");}
	    		 else if(j==2*n) {
						System.out.print("*");}
	    		 else {
	    			 System.out.print(" ");
	    		 }
				}System.out.println();
	    	
				
//	         
	     }
	}}


