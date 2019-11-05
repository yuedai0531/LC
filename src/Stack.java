import java.util.EmptyStackException;

public class Stack<T> {
	
	private static class StackNode<T>{
		//attributes
		private T data;
		private StackNode<T> next;
		
		//constructor
		public StackNode(T ndata){
			this.data = ndata;
		}	
	}

	//define top
	private StackNode<T> top;
	
	//pop function
	//returns popped function
	
	public T pop() {
		if(top != null)	{
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;		
	}
	
	public void push(T item) {
		StackNode<T> t = new StackNode(item);
		t.next = top;
		top = t;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
