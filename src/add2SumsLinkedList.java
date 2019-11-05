//not working for the case 5 and 5


class ListNode {
	int val;
	ListNode next = null;
	ListNode(int x) {
		val = x;
	}
}

public class add2SumsLinkedList {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		ListNode l1n = new ListNode(4);
		ListNode l1nn = new ListNode(3);
		ListNode l1nnn = new ListNode(9);
		
		ListNode l2 = new ListNode(5);
		ListNode l2n = new ListNode(6);
		ListNode l2nn = new ListNode(4);
		
		l1.next = l1n;
		l1.next.next = l1nn;

		l2.next = l2n;
		l2.next.next = l2nn;
		
		
		LLprinting(l1);
		LLprinting(l2);
		LLprinting(addTwoNumbers(l1,l2));
	}

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode k = n;
            	
    	while(l1 != null && l2 != null) {
	    	
    		int carry = 0;
    		
	    	if(l1.val + l2.val >= 10) {
	        	carry = 1;
	        }
	    	n.val = n.val + (l1.val + l2.val) % 10;
	    	
	    	System.out.println("cary: " + carry);
	    	
	    	if((l1.next == null || l2.next == null) && carry == 0)
	    		break;

    		n.next = new ListNode(carry);
            
	    	System.out.println(n.val);
	    	

	    	
	    	n = n.next;
	    	if(l1.next != null)
	    		l1 = l1.next;
	    	if(l2.next != null)
	    		l2 = l2.next;
        }
    	
        return k;
    }
    
    
    public static void LLprinting(ListNode n) {
    	
    	while(n != null) {
    		
    		if(n.next != null)
    			System.out.print(n.val + " -> ");
    		else
    			System.out.println(n.val);
    		//increment
    		n = n.next;
    			
    	}
    	
    }
}



