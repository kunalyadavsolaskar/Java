import java.util.Iterator;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []ar= {10,20,30,40,50,60,70,80,90};
		boolean flag=false;
		int k;
		int low=0,high=ar.length;
		
		System.out.println("enter the key");
		k=sc.nextInt();
		for(int i=0;i<(low+high)/2;i++) {//while(low<=high) this is also condition
			 int mid=(low+high)/2;
			if (k==ar[mid]) {
			flag=true;
				System.out.println("key "+k+" found at "+mid+" at "+(i+1)+" iteration");
				break;
			}
			else if (k<ar[mid]) {
				high=mid;				
			}
			else if (k>ar[mid]) {
				low=mid;
			}
		}
		if (flag==false) {
			System.out.println("key not found");
		}
	}

}
