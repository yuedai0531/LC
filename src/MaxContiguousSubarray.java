
public class MaxContiguousSubarray {

	public static void main(String[] args) {
		int[] test1 = {-2,1,-2,4,-1,2,1,-5,4};

		System.out.println(maxContSum(test1));
	}
	
	
	public static int maxContSum(int[] arr) {
		
		int globalMax = arr[0];
		int localMax = arr[0];
		
		//compare localMax with current index and take the largest
		
		for(int i = 1; i < arr.length; i++) {
			
			localMax = localMax + arr[i] > arr[i] ? localMax + arr[i] : arr[i]; 
			globalMax = globalMax > localMax ? globalMax : localMax;

		}
			
		return globalMax;
	}
	

}
