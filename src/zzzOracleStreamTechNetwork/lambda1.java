package zzzOracleStreamTechNetwork;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.Test;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */

public class lambda1 {
	/*@Test
	public void testRandom2() {
		Random random = new Random();
		IntStream intStream = random.ints(5, 1, 10);
		System.out.println("______________@@@@@@@@@@@'______________________-_> ");
		intStream.forEach( e->{System.out.println(e);}	 );
		
	}*/
	@Test
	public void test7() {
		IntStream intStream = IntStream.range(1, 10);
		LongStream longStream = LongStream.rangeClosed(1, 10);
		/*System.out.println("______________@@@@@@@@@@@'______________________-_> ");
		intStream.forEach( e->{System.out.println(e);}	 );*/
		
	}
	@Test
	public void lambda1() {
//		() -> { System.out.println("HAIIIIIIIIIIIIIII");};
		
	}
	
	@Test
	public void test2() {
//		() -> { for (int i =0; i< 1000; i++) System.out.println("HAIIIIIIIIIIIIIII"); };
		
	}
	
	
	@Test
	public void runnabletest() {
		Runnable runn = () -> { for (int i =0; i< 1000; i++) System.out.println("HAIIIIIIIIIIIIIII"); };
		new Thread(runn).start();
	}
	/**
	 * @author Renjith
	 *Another use case for the Supplier is defining a logic for sequence generation.
	 * To demonstrate it, 
	 *let’s use a static Stream.generate method to create a Stream of Fibonacci numbers:
	 */	
	/*@Test
	public void fibonacciTest() {
		int[] fibs = {0, 1};
		Stream<Integer> fibonacci = Stream.generate(() -> {
		    int result = fibs[1];//1
		    int fib3 = fibs[0] + fibs[1];//1
		    fibs[0] = fibs[1];//1
		    fibs[1] = fib3;
		    return result;
		});
		
		System.out.println("______________@@@@@@@@@@@'______________________-_> ");
		fibonacci.forEach( e->{System.out.print(e+ " ,  ");}	 );
		
	}*/
/*8. Consumers
As opposed to the Supplier, the Consumer accepts a generified argument and returns nothing.
 It is a function that is representing side effects.

For instance, let’s greet everybody in a list of names by printing the greeting in the console.
 The lambda passed to the List.forEach method implements the Consumer functional interface:

List<String> names = Arrays.asList("John", "Freddy", "Samuel");
names.forEach(name -> System.out.println("Hello, " + name));*/
	@Test
	public void test4() {
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		names.forEach(name -> System.out.println("Hello, " + name));
		
		
	}
	
	@Test
	public void test5() {
		
		
	}

}
