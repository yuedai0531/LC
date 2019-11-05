
// Java program to illustrate  
// Java.util.HashMap 
import java.util.HashMap; 
import java.util.Map; 
  
public class Hashing{ 
	
    public static void main(String[] args)  
    { 
    	String str = "asdfghjkl";
    	
        HashMap<Integer, Character> map = new HashMap<>(); 
          
        for(int i = 0; i < str.length(); i++) {
        	str.charAt(i);
        	if(map.containsValue(str.charAt(i))) {
        		System.out.println("false");
        		break;
        	}
        	map.put(i, str.charAt(i));
        }
        
        
          
        map.clear(); 
        print(map); 
    } 
      
    public static void print(Map<Integer, Character> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
    } 
} 