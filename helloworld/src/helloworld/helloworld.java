package helloworld;

public class helloworld {


	public static void main(String[] args) {
	int n=5;
		    int a = 1, b = 1;
		    while (n-- > 0) {
		        a = (b += a) - a;
		    System.out.println("a "+ a+" b "+b);}
		  System.out.println(a);
			
	}
}
