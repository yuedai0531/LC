import java.util.Arrays;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(fibWrapper(20));
	}
	
	public static int fibonacci(int n) {
		
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		memo[0] = 0;
		memo[1] = 1;
		for(int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];
	}
	
	public static int fibWrapper(int n) {
		int[] memo = new int[21];
		return fibonacci(n, memo);
	}
	
	
	public static int fibonacci(int i, int[] memo) {
		
		if(i == 0 || i == 1)
			return i;
		
		if (memo[i] == 0) {
			memo[i] = fibonacci(i-1, memo) + fibonacci(i-2, memo);
		}
		System.out.println("memo:" + memo[i]);
		System.out.println(Arrays.toString(memo));
		return memo[i];
	}

}
