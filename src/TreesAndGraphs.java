import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreesAndGraphs {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<>();

	}
	
	public static void visit(Node n) {
		System.out.println(n.value);
	}
	
	
	//recursive
	
	void inOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}
	
	void preOrderTraversal(Node node) {
		if(node != null) {
			visit(node);
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
		}
	}
	
	void postOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			visit(node);
		}
	}
	//
	void DFS(Node root) {
		if(root == null) {
			return;
		}
		visit(root);
		root.visited = true;
		for(Node n : root.adjacent) {
			if(n.visited == false)
				DFS(n);
		}
	}
	//make sure is visited?
	//use a queue
	void BFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		root.visited = true;
		q.add(root);
		
		while(!q.isEmpty()) {
			Node r = q.remove();
			visit(r);
			for(Node n : r.adjacent) {
				if(n.visited == false) {
					q.add(n);	
					n.visited = true;			
				}
			}	
			
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

}


