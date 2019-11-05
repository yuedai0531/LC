import java.util.*;


public class Okta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"java 0", "java 15","java 30", "java 59", "java 60", "java 120", "java 240", "python 0", "python 15", "python 45", "python 125"};
		
		System.out.println(solution(test, 3));
	}
	public static String solution(String[] A, int Y) {
		//A looks like "name time"
		//what do you do with time?
		
		int longest = 0;
		//db is an arraylist of String arrays, which are of size 2 and have 
		//name at first element and time at second element
		ArrayList<String[]> db = new ArrayList<String[]>();
		
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        
        for(String s : A) {
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
        ArrayList<String> times = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();
        	times.add(pair.getValue().toString());
        	names.add((String) pair.getKey());
            System.out.println(pair.getKey() + " = " + pair.getValue().toString());
            it.remove();
        }		

        //System.out.println(names);
       // System.out.println(times);

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < names.size(); i++) {
        	String s = times.get(i).substring(1, times.get(i).length() - 1);
        	String[] timeStampsString = s.split(", ");
        	
        	//System.out.println(s);
        	
        	int [] timeStamps = new int[timeStampsString.length];
        	//initialize counters
        	int count = 0;
        	for(int k = 0; k < timeStamps.length; k++) {
        		timeStamps[k] = Integer.parseInt(timeStampsString[k]);
        	}
        	System.out.println(Arrays.toString(timeStamps));
            result.add(overflow(timeStamps, Y));  

        }
        System.out.println(result.toString());
        String conca = "";
        for(int i = 0; i < result.size(); i++) {
        	conca += names.get(i) + " " + result.get(i) + " ";
        } 
		return conca;
	}
	
	public static int overflow(int[] times, int limit) {
		
		int count = 0;
		int size = times[times.length - 1] / 60;
		int[] cpm = new int[size + 1];
				
        for(int j = 0; j < size + 1; j++) {
        	for(int i = 0; i < times.length; i++) {
            	if(times[i] / 60 == j) {
            		++cpm[j];
            	}
        	}
    	}
        System.out.println("this is " + Arrays.toString(cpm));
        
	    for(int j = 0; j < cpm.length; j++) {
	    	if(cpm[j] > limit) {
	    		cpm[j] = limit;
	    	}
	    	count += cpm[j];
		}
	    System.out.println("count in overflow = " + count);
		return count;
	}
	
	public static boolean blacklist(String c, int limit) {
		
		
		
		return false;
	}

}
