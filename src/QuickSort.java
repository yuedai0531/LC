import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6, 7};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int arr[], int s, int e) {
		if (s < e) {
			int pI = partition(arr, s, e);
			
			quickSort(arr, s, pI - 1);
			quickSort(arr, pI + 1, e);
		}
	}
	
	public static int partition(int[] arr, int s, int e) {
		int pivot = arr[e];
		int i = s - 1;
		
		for (int j = s; j < e; j++) {
			if(arr[j] <= pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[e];
		arr[e] = temp;
		
		return i + 1;
	}
}
