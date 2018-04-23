package zzInterviewQandAHashMap;

import static org.junit.Assert.assertEquals;

import java.util.ArrayDeque;
import java.util.Deque;
import org.junit.Test;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *http://www.baeldung.com/java-array-deque
 */
public class arrayDequeTest {
	@Test
	public void whenPush_addsAtFirst() {
	    Deque<String> stack = new ArrayDeque<>();
	    stack.push("first");
	    stack.push("second");
	  
	    assertEquals("second", stack.getFirst());
	    assertEquals("first", stack.getLast());
	}
	
	@Test
	public void whenPop_removesLast() {
	    Deque<String> stack = new ArrayDeque<>();
	    stack.push("first");
	    stack.push("second");
	  
	    assertEquals(2, stack.size());
	    assertEquals("second", stack.pop());
	    assertEquals("first", stack.pop());
	    assertEquals(0, stack.size());
	}
	
	@Test
	public void whenPoll_removesFirst() {
	    Deque<String> queue = new ArrayDeque<>();
	    queue.offer("first");
	    queue.offer("second");
	  
	    assertEquals("first", queue.poll());
	}

}
