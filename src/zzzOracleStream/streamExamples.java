package zzzOracleStream;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.Test;

/**http://www.baeldung.com/java-8-streams
 * @author Renjith
 *
 */
/**
 * @author Renjith
 *
 */
/**
 * @author Renjith
 *
 */
public class streamExamples {
	
	@Test
	public void test1() {
		Stream<String> streamEmpty = Stream.empty();
		
		
		//assertTrue(streamEmpty.);
	}
	
	@Test
	public void test2() {
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		/*forEach(System.out::println);
		streamOfCollection.forEach(element -> System.out.println(element));*/
		System.out.println("test 2___> ");
		streamOfCollection.forEach(System.out::println);
	}
	
	@Test
	public void test3() {
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
//items.forEach(item->{ if("C".equals(item)){	System.out.println(item); }	 });
		
		streamOfArrayPart.forEach( item->{
											if("C".equals(item)){	System.out.println(item); }	 
											});//item->{ 		if("C".equals(item)){System.out.println(item);}	}
	}
	
	@Test
	public void filtertest() {
		Stream<String> streamOfArray = Stream.of(
				"1", "2", "1","1", "2", "1","1", "2", "1","1", "2","1","3","3","3","3","3","3");
		List<String> arrof1 = new ArrayList<>();
		List<String> arrof2 = new ArrayList<>();
		List<String> arrof3 = new ArrayList<>();
		
		
		//items.forEach(item->{ if("C".equals(item)){	System.out.println(item); }	 });
		streamOfArray.forEach( item->{
			if("1".equals(item)){	arrof1.add("1"); }	
			else if("2".equals(item)){	arrof2.add("2"); }
			else if("3".equals(item)){	arrof3.add("3"); }
			});
		System.out.println("filtertest______________________> ");
		arrof1.stream().forEach( item->{System.out.println(item);}	 );
		arrof2.stream().forEach( item->{System.out.println(item);}	 );
		arrof3.forEach( item->{System.out.println(item);}	 );
	}
	
	@Test
	public void test4() {
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
	}
	
	@Test
	public void streamGeneratedtest() {
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		//System.out.println("streamGeneratedtest______________________> ");
		//streamGenerated.forEach( item->{System.out.println(item);}	 );
	}
	@Test
	public void streamGeneratedtest2() {
		Stream<String> streamGenerated =
				  Stream.generate(() -> "i").limit(10);
		//System.out.println("streamGeneratedtest______________________> ");
		//streamGenerated.forEach( item->{System.out.println(item);}	 );
	}
	/**
	 * @author Renjith
	 *2.6. Stream.iterate()
Another way of creating an infinite stream is by using the iterate() method:

1
Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
The first element of the resulting stream is a first parameter of the iterate() method. 
For creating every following element the specified function is applied to the previous element. 
In the example above the second element will be 42.
	 */
	@Test
	public void iterateTest() {
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		System.out.println("iteratetest______________________> ");
		streamIterated.forEach( item->{System.out.println(item);}	 );
	}
	
	@Test
	public void iterateTest2() {
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		/*System.out.println("test 2___> ");
		streamIterated.forEach(System.out::println);*/
	}
	
	@Test
	public void test7() {
		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		
	}
	
	/*Since Java 8 the Random class provides a wide range of methods for generation streams
	 *  of primitives. 
	 * For example, the following code creates a DoubleStream, which has three elements:*/
	@Test
	public void testRandom() {
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		System.out.println("____________________________________-_> ");
		doubleStream.forEach( e->{System.out.println(e);}	 );
		
	}
	@Test
	public void testRandom2() {
		Random random = new Random();
		IntStream intStream = random.ints(5, 1, 4);
		//System.out.println("______________@@@@@@@@@@@'______________________-_> ");
		//intStream.forEach( e->{System.out.println(e);}	 );
		
	}
	

	@Test
	public void streamOfStringtest() {
		IntStream streamOfChars = "abc".chars();
		
		Stream<String> streamOfString =
				  Pattern.compile(", ").splitAsStream("a, b, c");
		System.out.println("______________@@@@@@@@@@@'______________________-_> ");
		streamOfChars.forEach( e->{System.out.println(e);}	 );
		
		streamOfString.forEach( e->{System.out.println(e);}	 );
	}

/*	@Test
	public void test10() {
		Path path = Paths.get("C:\\file.txt");
		try {
			Stream<String> streamOfStrings = Files.lines(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Stream<String> streamWithCharset = 
			  Files.lines(path, Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/

	@Test
	public void test11() {
		
		
	}

	

}
