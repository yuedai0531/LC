import java.util.*;


public class recursiveCountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDown(8);
		
		System.out.println(test(8));
	}
	
	static void printDown(int n) {
		if(n == 1) {
			System.out.println(0);
		}else {
			printDown(n - 1);
			 System.out.println(n-1);
		}
	}
	static int test(int n){
		

		ArrayList<Integer> l = new ArrayList<Integer>();
		
		if (n == 0) {
			l.add(0);
			return 0;
		}
		
		l.add(test(n-1));
		
		System.out.println(l.toString());
		return test(n-1);

		
	}
	
	
	
	
}


class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        
        //find smallest count
        int smallest = Integer.MAX_VALUE;
        for(int j = 0; j < strs.length; j++){
            if(smallest > strs[j].length()){
                smallest = strs[j].length();
            }
        }
        
        
        
        String result = "";
        
        for(int i = 0; i < strs[0].length(); i++){
           if(strs[0].charAt(i) == strs[1].charAt(i) && strs[0].charAt(i) == strs[2].charAt(i) && strs[1].charAt(i) == strs[2].charAt(i))
               result += strs[0].charAt(i);
        }
        return result;
        
        
        
    }
}