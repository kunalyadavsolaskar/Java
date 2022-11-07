import java.util.*;
public class selectionSort {

	static void selection_Sort(int numArray[]) 
    { 
        int n = numArray.length; 
   
        											// traverse unsorted array 
        for (int i = 0; i < n-1; i++) 
        { 
            										// Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (numArray[j] < numArray[min_idx]) 
                    min_idx = j; 
     
            int temp = numArray[min_idx]; 
            numArray[min_idx] = numArray[i]; 
            numArray[i] = temp; 
        } 
    } 
   
    public static void main(String args[]) 
    { 
        
        int numArray[] = {7,5,2,20,42,15,23,34,10};
        System.out.println("Original Array:" + Arrays.toString(numArray)); 
         selection_Sort(numArray); 
        System.out.println("Sorted Array:" + Arrays.toString(numArray)); 
    } 

}
