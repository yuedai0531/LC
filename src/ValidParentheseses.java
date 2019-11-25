import java.util.Stack;


public class ValidParentheseses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()[]{}";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		
		
		for(int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if(tmp == '}') {
				if(stack.pop() != '{') {
					return false;
				}	
			}
			else if(tmp == ')') {
				if(stack.pop() != '(') {
					return false;
				}	
			}
			else if(tmp == ']') {
				if(stack.pop() != '[') {
					return false;
				}
			}else {
				stack.push(tmp);
			}
			
		}
		System.out.println(stack);

		return stack.empty();
	}

}
