
public class quickSort {
	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
	static void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 31, 25, 8, 32, 17, 40, 42};
		System.out.println("UnSorted Array");
		printArr(arr, arr.length);  
		quickSort(arr,0,arr.length-1);
		System.out.println(" ");
		System.out.println("Sorted Array");
		printArr(arr, arr.length);  
	}

}
