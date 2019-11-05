import java.util.Arrays;


//working


public class RmvArrDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,1,2,2,3,3,3,4,5,6,7,8,9};
		//expected 1, 2, 3, 4, 5, 6, 7, 8, 9.
		//length of 10
		
		//LOGIC
		//
		
		int temp = input[0];
		int index = 0;
		
		for(int i = 0; i < input.length; i++) {

			//System.out.println(temp);
			
			//if temp is not same as temp
			
			System.out.println("input to check " + input[i] + " comparee " + temp);
			
			if(temp != input[i]) {
				System.out.println(index);
				//set input at index to not repeated
				input[index] = temp;
				
				//set temp to next element
				temp = input[i];
				
				index++;
			}

			System.out.println(Arrays.toString(input));
			
		}
		
		System.out.println(Arrays.toString(input));
		
	}

}
