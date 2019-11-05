import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



public class PQ {

	public static void main(String[] args) {
		
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 < o2) {
					return 1;
				}
				return -1;
			}
			
		};
		
		Queue<Integer> qneg = new PriorityQueue<Integer>(com);
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		for (int i = 0; i < 10; i++) {
			qneg.add(2*i);
			q.add(-2*i);
		}
		
//		for (Integer n : q) {
//			System.out.println(-n); 
//		}

		 	
		 
		for (int i = 0; i < 10; i++) {
			System.out.println(qneg.poll());
		}
		
		
	}

}
