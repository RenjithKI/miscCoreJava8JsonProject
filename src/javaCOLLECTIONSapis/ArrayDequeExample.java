package javaCOLLECTIONSapis;

/**
 * @author Renjith
 *Deque is a Queue in which you can add and remove elements from both sides. 
 *In the Java Queue tutorial we have seen that the Queue follows FIFO (First in First out) 
 *and in PriorityQueue example we have seen how to remove and add elements based on the 
 *priority. In this tutorial, we will see how to use Deque.

Deque is an interface and has two implementations: LinkedList and ArrayDeque. 
By implementation I refer that these classes LinkedList and ArrayDeque implements Deque 
interface, so we can create the instance of these and assign it to the Deque like this:

Deque dq = new LinkedList();
Deque dq = new ArrayDeque();
 */
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeExample {

   public static void main(String[] args) {
		  
       /*
	* We cannot create instance of a Deque as it is an
	* interface, we can create instance of ArrayDeque or
	* LinkedList and assign it to Deque
	*/
       Deque<String> dq = new ArrayDeque<String>();
	    
       /*
	* Adding elements to the Deque.
	* addFirst() adds element at the beginning 
        * and addLast() method adds at the end.
	*/
	dq.add("Glenn");
	dq.add("Negan");
	dq.addLast("Maggie");
	dq.addFirst("Rick");
	dq.add("Daryl");
	    
	System.out.println("Elements in Deque:"+dq);

        /*
	 * We can remove element from Deque using remove() method,
	 * we can use normal remove() method which removes first 
	 * element or we can use removeFirst() and removeLast()
	 * methods to remove first and last element respectively.
	 */
	System.out.println("Removed element: "+dq.removeLast());
	    
	/*
	 * element() method - returns the head of the
	 * Deque. Head is the first element of Deque
	 */
	 System.out.println("Head: "+dq.element());
	    
	/*
	 * pollLast() method - this method removes and returns the 
	 * tail of the Deque(last element). Returns null if the Deque is empty.
	 * We can also use poll() or pollFirst() to remove the first element of
	 * Deque.
	 */
	System.out.println("poll(): "+dq.pollLast());
	    
	/*
	 * peek() method - it works same as element() method,
	 * however it returns null if the Deque is empty. We can also use 
	 * peekFirst() and peekLast() to retrieve first and last element
	 */
	System.out.println("peek(): "+dq.peek());
	    
	//Again printing the elements of Deque
	System.out.println("Elements in Deque:"+dq);
   }
}