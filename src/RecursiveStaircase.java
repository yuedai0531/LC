import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveStaircase {
	public static void main(String[] args) {
		
		int result = stair(8);
		System.out.println(result);
		
		int result2 = stairFast(8);
		System.out.println(result2);
	}
	
	//we want to return # of ways you can go up n stairs
	static int stair(int n) {
		//base cases
		
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return stair(n - 1) + stair(n - 2);
		}
		
	}
	
	//fix with dynamic programming
	static int stairFast(int n) {
		//base cases again

		if (n == 0 || n == 1) {
			return 1;
		}
		int[] memo = new int[n + 1];
		memo[0] = 1;
		memo[1] = 1;
		for(int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		System.out.println(Arrays.toString(memo));
		return memo[n];
	}
}
