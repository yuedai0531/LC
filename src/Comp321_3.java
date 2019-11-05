import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Comp321_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//process data
		Scanner scan = new Scanner(System.in);

		int total = scan.nextInt();
		
		for (int i = 0; i < total; i ++) {
			HashMap<String, Integer> visited = new HashMap<>();
			StringBuilder game = new StringBuilder(scan.next());
						
			System.out.println(go(visited, game));
		}
		
		
    	String[] s = {	"---oo----------oo------",
				"-o--o-oo-----o--o-oo---",
				"-o----ooo----o----ooo--",
				"ooooooooooooooooooooooo",
				"oooooooooo-ooooooooooo-"};

	
	}
	
	
	public static int go(HashMap<String, Integer> visited, StringBuilder game) {
		
		if(visited.get(game.toString()) == null) {
			visited.put(new String(game.toString()), -1);
		}
		else if(visited.get(game.toString()) != -1) {
			return visited.get(game.toString());
		}
		
		String prev = new String(game.toString());
		
        int res = 0;
        for (int i = 0; i < game.length(); i++) {
            if (game.charAt(i) == 'o') {
                res++;
            }
        }
        
        for (int i = 0; i < game.length(); i++) {
            if (game.charAt(i) == 'o') {
            	
            	//forward
                if (i + 2 < game.length() && game.charAt(i + 1) == 'o' && game.charAt(i + 2) == '-') {
                    game.setCharAt(i, '-');
                    game.setCharAt(i + 1, '-');
                    game.setCharAt(i + 2, 'o');
                    res = Math.min(res, go(visited, game));
                    game = new StringBuilder(prev);
                }
                //backward
                
                if (i - 2 >= 0 && game.charAt(i - 1) == 'o' && game.charAt(i - 2) == '-') {
                    game.setCharAt(i, '-');
                    game.setCharAt(i - 1, '-');
                    game.setCharAt(i - 2, 'o');
                    res = Math.min(res, go(visited, game));
                    game = new StringBuilder(prev);
                }
            }
        }

        visited.put(game.toString(), res);
        return res;
	}

}
