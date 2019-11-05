import java.util.*;


public class Okta2 {
	public static void main(String args[]) {
        String[] input = {"Java 0", "Java 1", "Java 22", "Python 333", "Python 4444", "Python 55555", "Python 666666", "Haskell 7777777", "Haskell 88888888"};
        
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        
        for(String s : input) {
        	String[] info = s.split(" ");
        	if(!map.containsKey(info[0])) {
        		ArrayList<Integer> temp = new ArrayList<Integer>();
        		temp.add(Integer.parseInt(info[1]));
        		map.put(info[0], temp);
        	}
        	else {
        		ArrayList<Integer> temp = map.get(info[0]);
        		temp.add(Integer.parseInt(info[1]));
        		map.put(info[0], temp);
        	}
        }
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue().toString());
            it.remove();
        }
    }
}