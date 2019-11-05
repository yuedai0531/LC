import java.util.Arrays;

public class TripleStep {

	public static void main(String[] args) {
		
		
		
		
		System.out.println(f(20));

	}

	public static int f(int i) {
//		
//		if(i<0) {
//			return 0;			
//		}
//		if(i==0) {
//			return 1;
//		}else {
//			return f(i-1)+f(i-2)+f(i-3);
//		}
//		
		int[] memo = new int[i + 1];
		Arrays.fill(memo, -1);
		return f(i, memo);
	}
		
//add memoization
	public static int f(int i, int[] memo) {
		
		if(i < 0) {
			return 0;			
		}
		else if(i == 0) {
			return 1;
		}else if(memo[i] > -1){
			return memo[i];
		}
		else {
			memo[i] = f(i - 1, memo) + f(i - 2, memo)+f(i - 3, memo);
			return memo[i];
		}
	}

}
