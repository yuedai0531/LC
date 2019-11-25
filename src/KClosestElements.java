import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class KClosestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {
				{1,3,1},
				{1,5,1},
				{4,2,1},
		};

		int[][] pts1 = {{3,3},{5,-1},{-2,4}};
		int[][] pts2 = {{0,1},{1,0}};
				
		int[][] pts =  {{1,3},{-2,2}};

		
		System.out.println("ANS: " + Arrays.toString(closest(pts, 1)));
		
	}
	
	public static int[][] closest(int[][] pts, int k){
		int[][] res = new int[k][2];
		
		Double[] toSort = new Double[pts.length];
		
		HashMap<Double, ArrayList<Integer>> map = new HashMap<>();
		
		for(int i = 0; i < pts.length; i++) {
			int[] pt = pts[i];
			
			System.out.println(Arrays.toString(pt));
			
			Double val1 = Math.pow(pt[0], 2) + Math.pow(pt[1], 2);
			Double val2 = Math.sqrt(val1);
			
			if(map.containsKey(val2)) {
				map.get(val2).add(i);
			}
			else {
				ArrayList<Integer> tmp = new ArrayList<>();
				tmp.add(i);
				map.put(val2, tmp);
			}	
			System.out.println(val1);
			toSort[i] = val2;
		}
		
		
		System.out.println(map);
		
		Arrays.sort(toSort);

		System.out.println("sorted " + Arrays.toString(toSort));
		
		
		for(int j = 0; j < k; j++) {
			double key = toSort[j];
			if(map.get(key) != null) {
				int idx = map.get(key).remove(0);
				System.out.println(idx);
				res[j] = pts[idx];
			}

		}
		
		return res;
	}

}
