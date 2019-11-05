import java.util.ArrayList;

public class LettersPhoneNumber {
	String name;
	
	
	public static void main(String[] args) {
		
		
		String[] lookup = new String[] {" ", " ", "abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wyxz"};
		
		ArrayList<String> out = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		gen(2342342, 0, lookup, sb, out);
	}
		
	public static void gen(int n, int idx, String[] lookup, StringBuilder sb, ArrayList<String> out) {
				
		//base case
		int l = Integer.valueOf(n).toString().length();
		
		
		if (idx >= l) {
			System.out.println(sb.toString());
			return;
		}
		
		int cur = Character.getNumericValue(Integer.valueOf(n).toString().charAt(idx));
		
		for(int i = 0; i < lookup[cur].length(); i++) {
			sb.append(lookup[cur].charAt(i));
			gen(n, idx + 1, lookup, sb, out);
			sb.deleteCharAt(idx);
		}
		
	}
}
