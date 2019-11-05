import java.util.Arrays;

/*
1st loop: to count number of times you iterated
2nd loop (inner): iterate, while comparing and swap.

Basically has a comparer and a comparee,
comparer takes biggest number and "drops it" when comparee is bigger
bigger numbers go to the back.
ends up sorted very slowly
*/


public class BubzSort {

	public static void main(String[] args) {	
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubzSort(input);
		System.out.println(Arrays.toString(input));
	}
	
	public static int[] bubzSort(int[] arr) {
		int l = arr.length;
		int k;
		for(int i = l; i >= 0; i--) {
			for(int j = 0; j < l-1; j++) {
				k = j + 1;
				if(arr[j] > arr[k]) {
					swapNums(j,k,arr);
				}
			}
		}
		return arr;
	}	
	
	public static void swapNums(int i,int j,int[] array) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	
	
}
