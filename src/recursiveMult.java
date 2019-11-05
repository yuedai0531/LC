
public class recursiveMult {

	public static void main(String[] args) {
		
		System.out.println(mult(4, 5));

	}
	
	static int mult(int a, int b) {
		
		if (b == 1)
			return a;
		else		
			return a + mult(a, b-1);
	}

}
