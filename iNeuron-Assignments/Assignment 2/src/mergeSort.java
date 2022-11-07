import java.util.Arrays;

public class mergeSort {
	static void mergesort(int[] input, int start, int end) { 
		// break problem into smaller structurally identical problems 
		int mid = (start + end) / 2; 
		if (start < end) { 
			mergesort(input, start, mid); 
			mergesort(input, mid + 1, end);
			} // merge solved pieces to get solution to original problem 
		int i = 0, first = start, last = mid + 1;
		int[] tmp = new int[end - start + 1]; 
		while (first <= mid && last <= end) { 
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++]; 
			} 
		while (first <= mid) { 
			tmp[i++] = input[first++];
			} 
		while (last <= end) {
			tmp[i++] = input[last++];
			}
		i = 0;
		while (start <= end) {
			input[start++] = tmp[i++];
			} 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 12, 31, 25, 8, 32, 17, 40, 42}; 
		System.out.println("array before sorting"); 
		System.out.println(Arrays.toString(arr));
		
		 mergesort(arr, 0, arr.length - 1);
		System.out.println("array after sorting using mergesort algorithm");
		System.out.println(Arrays.toString(arr));

		
	}
	
	
		}


		