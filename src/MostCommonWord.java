import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class MostCommonWord {
	
//	DUMBASS MODIFICATIONS HAS BEEN DONE TO SUIT THE STUPID LC TESTCASES

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = mostCommonWord(
				//"Bob hit a ball, the hit BALL flew far after it was hit.",
				"a, a, a, a, b,b,b,c, c",
				new String[]{"a"} );
		System.out.println(s);
		
	}
    public static String mostCommonWord(String paragraph, String[] banned) {     
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> banSet = new HashSet<>();
        banSet.add(" ");
        banSet.add("");
        for (String s : banned) {
        	banSet.add(s);
        }
        
        Character[] sym = {'!','?', ',' , 39, 59 ,'.'};
        
        //process array
        for(Character c : sym){
            System.out.print(c + " ");
            paragraph = paragraph.replace(c.toString(), " ");
        }
        paragraph = paragraph.toLowerCase();
        
        String[] arr = paragraph.split(" ");
        
        System.out.println(Arrays.deepToString(arr));
        
        for(String s : arr) {
        	if(map.containsKey(s)) {
        		map.replace(s, map.get(s) + 1);
        	}else {
        		map.put(s, 1);
        	}
        }
        
        System.out.println(map);
        
        int cur_max = 0;
        String res = null;
        for(Entry<String, Integer> m : map.entrySet()) {
        	if(banSet.contains(m.getKey())) {
        		continue;
        	}
        	System.out.println(m);
        	if (cur_max < m.getValue()) {
        		cur_max =  m.getValue();
        		res = m.getKey();
        	}

        	
        }

        return res;
    }

}
