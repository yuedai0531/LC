import java.util.ArrayList;
import java.util.List;

public class GoodTuples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,1,5,3,2,3};
		
		go(arr);
	}
	// takes in array and checks 3
	public static void go(int[] arr) {
		
		for (int i = 0; i < arr.length-2; i++) {
			
			List<Integer> al = new ArrayList<Integer>();
			boolean flag1 = false;
			boolean flag2 = false;
			al.add(arr[i]);
			for (int j = 1; j <= 2; j++) {
				

				if (al.contains(arr[i+j])) {
					flag2 = true;
				}
				
				al.add(arr[i+j]);
				
				if (al.contains(2)){
					flag1 = true;
				}
			}
			
			System.out.println(al.toString());
			System.out.println(flag1 && flag2);
			
		}
		
	}

}
