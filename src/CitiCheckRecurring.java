import java.util.HashSet;

//working


public class CitiCheckRecurring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdfghjklafjl";
		HashSet<Character> toCheck = new HashSet<Character>();
		String result = "";
		
		//try with stringbuilder
		
		for(int i = 1; i<s.length();i++) {
			toCheck.add(s.charAt(i-1));
			if(toCheck.contains(s.charAt(i))) {
				result += s.charAt(i);
			}	
		}
		
		System.out.println(result);
		
		
		
		
	}

}
