package functionalPRogrammingSTREAMoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

/**
 * @author Renjith
 *http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
public class intStreamrange {
	
	public static void main(String[] args) {
		
		
			IntStream.range(1, 4)
		    .forEach(System.out::println);

		// 1
		// 2
		// 3
		
	}

}
