package functionalPRogrammingSTREAMoperation;

import java.util.stream.Stream;

/**
 * @author Renjith
 *http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
public class filter {
	
	public static void main(String[] args) {
		
			System.out.println("______________test 9___________#> ");
			Stream.of("d2", "a2", "b1", "b3", "c")
		    .filter(s -> {
		        System.out.println("filter: " + s);
		        return true;
		    });
			
			
			System.out.println("______________test 9___________#> ");
			
			
			Stream.of("d2", "a2", "b1", "b3", "c")
		    .filter(s -> {
		        System.out.println("filter: " + s);
		        return true;
		    })
		    .forEach(s -> System.out.println("forEach: " + s));
		
	}

}
