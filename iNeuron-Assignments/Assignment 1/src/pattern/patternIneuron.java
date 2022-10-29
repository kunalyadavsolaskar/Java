package pattern;

public class patternIneuron {
	static int h = 7;
	 
	static int w = (2 * h) - 1;
	static int abs(int d)
	{
	    return d < 0 ? -1 * d : d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// letter I
		int i, j,count=0;
	    for (i = 0; i < h; i++)
	    {
	        for (j = 0; j < h; j++)
	        {
	            if (i == 0 || i == h - 1)
	                System.out.printf("*");
	            else if (j == h / 2)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.println();
	    
	 // letter N
	    for (i = 0; i < h; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= h; j++)
	        {
	            if (j == h)
	                System.out.printf("*");
	            else if (j == count)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        count++;
	        System.out.printf("\n");
	    }
	    System.out.println();
	    
	 // letter E
	    for (i = 0; i < h; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < h; j++)
	        {
	            if ((i == 0 || i == h - 1)
	                || (i == h / 2
	                    && j <= h / 2))
	                System.out.printf("*");
	            else
	                continue;
	        }
	        System.out.printf("\n");
	    }
	    System.out.println();
	    
	 // letter U
	    for (i = 0; i < h; i++)
	    {
	        if (i != 0 && i != h - 1)
	            System.out.printf("*");
	        else
	            System.out.printf(" ");
	        for (j = 0; j < h; j++)
	        {
	            if (((i == h - 1)
	                && j >= 0
	                && j < h - 1))
	                System.out.printf("*");
	            else if (j == h - 1 && i != 0
	                    && i != h - 1)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    
	 // letter R
	    System.out.println();
	    int mid = (h / 2);
	    for (i = 0; i < h; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j < w; j++)
	        {
	            if ((i == 0 || i == mid)
	                && j < (w - 2))
	                System.out.printf("*");
	            else if (j == (w - 2)
	                    && !(i == 0 || i == mid))
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        System.out.printf("\n");
	    }
	    System.out.println();
	    
	 // letter O

	    for (i = 1; i <= h; i++) {
             for (j = 1; j <= w; j++) {
               if (i == 1 || i == h || j == 1 || j == w) {
            	   if((j==1 && i==1) || (j==w&&i==1)||(j==1 && i==h) || (j==w&&i==h)) {
            		   System.out.print(" ");
            	   }
            	   else
            	   System.out.print("*");
               }
                else
                	System.out.print(" ");
            }
 
           
            System.out.println();
        }
	    System.out.println();
	 // letter N
	    count=0;
	    for (i = 0; i < h; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= h; j++)
	        {
	            if (j == h)
	                System.out.printf("*");
	            else if (j == count)
	                System.out.printf("*");
	            else
	                System.out.printf(" ");
	        }
	        count++;
	        System.out.printf("\n");
	    }

	}

}
