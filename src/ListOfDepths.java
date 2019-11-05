import java.util.*;

//got the idea right
//code not syntaxically correct

public class ListOfDepths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
	}
	public static void visit(Node n) {
		System.out.println(n.value);
	}
	
	public static ArrayList<LinkedList<Node>> depthList(Node root) {
		ArrayList<LinkedList<Node>> resultArr = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> result = new LinkedList<Node>();
		Queue<Node> q = new LinkedList<Node>();		
		
		if(root == null) {
			return resultArr;
		}
		
		q.add(root);
		
		
		while(!q.isEmpty()) {
			resultArr.add(result);
			LinkedList<Node> parents = result;
			
			//reset result
			result = new LinkedList<Node>();
			
			Node r = q.remove();
			result.add(r);
			for(Node n : r.adjacent) {
				q.add(n);
				
			}
		}
		
		
		 
		
		return resultArr;
	}
}

class Node{
	
    int value;
    Node left;
    Node right;
    Node[] adjacent;
    boolean visited = false; 
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}

