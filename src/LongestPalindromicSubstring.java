
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "cabbac";
		
		System.out.println(fct(s));
		
	}
	public static String fct(String s) {
		
		int r, l;
		
		char[] arr = s.toCharArray();
		
		String res = "";

		for(int i = 1; i < 2 * s.length(); i++) {
			
			// take middle
			// or take left and right

			r = 0;
			l = 0;
			
			while (l > 0 && r < s.length() && arr[l] == arr[r]) {		
				
				r++;
				l--;
				
			}
			r = r % 2;

			System.out.println(r);
			String cur = s.substring(l, r);
			System.out.println("current res " + res + " vs " + cur);
			res = res.length() > cur.length() ? res : cur;
		}	
		return res;
	}

}
