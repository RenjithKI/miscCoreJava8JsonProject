package zzzOracleStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *http://www.baeldung.com/java-8-streams
 */
public class streamm {
	public Stream<String> streamOf(List<String> list) {
	    return list == null || list.isEmpty() ? Stream.empty() : list.stream();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> streamEmpty = Stream.empty();
		//Stream of Collection
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		
		//They can also be created out of an existing array or of a part of an array:

		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
		//2.4. Stream.builder()
		//
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		
		/*Stream.generate()*/
		Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);
		
		/*Stream.iterate()*/
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

		/* IntStream */
		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		
		/*Since Java 8 the Random class provides a wide range of methods for generation streams
		 *  of primitives. 
		 * For example, the following code creates a DoubleStream, which has three elements:*/
		Random random22 = new Random();
		DoubleStream doubleStream22 = random22.doubles(3);
		
		/*Stream.generate()*/
		Stream<String> streamGenerated5 =
				  Stream.generate(() -> "element").limit(10);
		
		/*Stream.generate()*/
		Stream<String> streamGenerated3 =
				  Stream.generate(() -> "element").limit(10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
