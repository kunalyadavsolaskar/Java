import java.util.Iterator;
import java.util.Scanner;

public class DuplicateElementInArray {
    public static void main(String[] args) {      
        int [] arr =  {1, 2, 3, 4, 2, 7, 8, 8, 3};
        boolean flag=false;
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("How many number you want to enter");
//    	
//    	int n=sc.nextInt();
//    	int arr[]=new int[n];
//    	System.out.println("Enter the values");
//    	for(int i=0;i<n;i++) {
//    		arr[i]=sc.nextInt();
//    	}
        System.out.println("Duplicate elements in array: ");  
          
        for(int i = 0; i < arr.length-1; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) { 
                	flag=true;
                    System.out.println(arr[j]);  
            }  }
        }
        if (flag==false) {
			System.out.println("No Duplicate Element");
		}
    } 
}
