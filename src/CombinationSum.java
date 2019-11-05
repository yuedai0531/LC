import java.util.ArrayList;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,6,3,4,2};
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sub = new ArrayList<Integer>();
		go(a, 7, 0, res, sub);
		
		for (ArrayList<Integer> n : res) {
			System.out.println(n.toString());
		}
		System.out.println(res.toString());
	}
	
	public static void go(int[] a, int t, int idx, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> sub) {
		
		if(t > 0) {
			for (int i = idx; i < a.length && t >= a[i]; i++) {
				
				System.out.println("t: " + t);
						
				System.out.println("val: " + a[i]);
				
				sub.add(a[i]);
				
				go(a, t - a[i], i, res, sub);
				
				sub.remove(sub.size() - 1);
				
			}
		}
		else if (t == 0) {
			System.out.println(sub);
			// not possible to do res.add(sub)
			// because sub will then change.
			// so you have to add a new instance of sub
			res.add(new ArrayList<Integer>(sub));
		}
		//sub.remove(sub.size() - 1);
	}

}
