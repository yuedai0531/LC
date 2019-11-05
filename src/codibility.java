import java.util.*;
public class codibility {


    public int solution(int[] A) {
        // write your code in Java SE 8
    	
    	System.out.println(A.length);
    	int index=0;
    	int initial=A[index];
        int element=0;
        int counter=0;
        for(int i=0;i<A.length;i++) {
        	
            element=A[index];
            index = element;
            counter++;
            if(element==initial) {
            	break;
            }
        }

        
        
        
        
        
        return counter;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


