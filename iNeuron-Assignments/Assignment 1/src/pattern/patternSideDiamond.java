package pattern;



public class patternSideDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k;
		 int n= 7;  
		     for(i=0;i<n;i++) {
		    	 System.out.print("*");
		     }
		   
		    for(i=0;i<n;i++)
		    {
			    for(j=0;j<n-i;j++){
		                     System.out.print("*");
				    }
				    for(k=0;k<=i;k++){
				        System.out.print(" ");
				}
				 System.out.println("");
			    }
			    
			 for(i=n-1;i>0;i--)
		    {
			    for(j=n;j>=i;j--){
		                     System.out.print("*");
			    }
			    for(k=i;k>0;k--){
				        System.out.print(" ");
				}
				 System.out.println("");
			    }
			 for(i=0;i<2*n;i++) {
		    	 System.out.print("*");
		     }

	}

}
