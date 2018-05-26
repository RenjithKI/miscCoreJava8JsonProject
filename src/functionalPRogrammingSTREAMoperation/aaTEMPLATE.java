package functionalPRogrammingSTREAMoperation;

import java.util.Arrays;
import java.util.List;

/**
 * @author Renjith
 *http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
public class aaTEMPLATE {
	
	public static void main(String[] args) {
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEach(System.out::println);

			// C1
			// C2
	}

}
