import java.util.Arrays;
import java.util.HashMap;

public class DivisorSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2345 % 10);
		Integer n = 120;
		System.out.println(n.toString().toCharArray()[0]);
		System.out.println();
		
		char[] intTab = String.valueOf(n).toCharArray();
		
		System.out.println(Arrays.toString(intTab));
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
		System.out.println(Integer.valueOf("123") + 1);
		
		char n1  = 1;
		map.put(n1, 1);
		
		go(n1, 2);
	}
	
	public static void go(int n, Integer k) {
		
		char[] intTab = String.valueOf(n).toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i + k <= intTab.length; i++) {
			sb.append(Arrays.copyOfRange(intTab, i, i+k));
			System.out.println(sb.toString());
			int div = Integer.parseInt(sb.toString());
			if (n % div == 0) {
				System.out.println(true);
			}
			sb.delete(0, k);
		}		
		
	}

}