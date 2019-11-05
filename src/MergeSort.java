import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	// MAIN METHOD TO CALL
	//n = size
	public static void sort(int arr[], int n) {
		//array size 1 base condition
		if (n < 2)
			return;
		//get mid point
		int mid = n / 2;
		
		//creating new arrays of size mid and n - mid
		int[] l = new int[mid];
		int[] r = new int[n - mid];
		
		//populating l and r
		for (int i = 0; i < mid; i++) {
			l[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = arr[i];
		}
		
		//calling recursively so it breaks down to arrays of size 1
		//then it can come out of the recursive call
		sort(l, mid);
		//same thing on other side
		sort(r, n - mid);
		
		// once everything is of size one, merge begins
		merge(arr, l, r, mid, n - mid);
	}
	
	// HELPER MERGING METHOD
	public static void merge(int[] arr, int[] l, int[] r, int left, int right){
		
		int i = 0, j = 0, k = 0;
		
		while ( i < left && j < right) {
			// compare left and right array elements
			if (l[i] <= r[j]) {
				arr[k++] = l[i++];
			}	
			else {
				arr[k++] = r[j++];
			}	
		}
		
		//filling remaining elements
		
		while (i < left) {
			arr[k++] = l[i++];
		}
		
		while (j < right) {
			arr[k++] = r[j++];
		}
		
	}
	


}
