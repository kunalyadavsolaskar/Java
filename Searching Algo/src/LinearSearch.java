import java.util.Scanner;



public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		int k;
		System.out.println("enter the key");
		k=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if (k==a[i]) {
				flag=true;
				System.out.println("key found");
				break;
			}}
		if (flag==false) {
			System.out.println("key not found");
			
		}
	}

}
