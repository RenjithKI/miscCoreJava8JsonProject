package javaCOLLECTIONSapis;
/*//import static org.junit.Assert.assertThat;
*/
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;
import org.hamcrest.core.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.equalTo;
/**https://beginnersbook.com/2013/12/java-arraylist/
 * @author Renjith
 * 
 *http://www.baeldung.com/java-arraylist
 */
public class ArrayListTest {
	@Test
	public void test1() {
		List<Long> list = new ArrayList<>();		 
		list.add(1L);
		list.add(2L);
		list.add(1, 3L);		 
		assertThat(Arrays.asList(1L, 3L, 2L), equalTo(list));
		//(Arrays.asList(1L, 3L, 2L), equalTo(list));
	}
	
	@Test
	public void test2() {
		List<String> list = new ArrayList<>();
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void test3() {
		Collection<Integer> number 
		  = IntStream.range(0, 10).boxed().collect(Collectors.toSet());
		
		System.out.println(number);
		 
		List<Integer> list = new ArrayList<>(number);
		assertEquals(10, list.size());
		assertTrue(number.containsAll(list));
		
	}
	
	@Test
	public void test33() {
		Collection<Integer> number 
		  = IntStream.range(0, 100).boxed().collect(Collectors.toSet());
		
		System.out.println(number);
		 
		List<Integer> list = new ArrayList<>(number);
		assertEquals(10, list.size());
		assertTrue(number.containsAll(list));
		
	}
	
	@Test
	public void test4() {
		
		List<Integer> list = new ArrayList<>(
				  IntStream.range(0, 10).boxed().collect(Collectors.toCollection(ArrayList::new))
				);
				ListIterator<Integer> it = list.listIterator(list.size());
				List<Integer> result = new ArrayList<>(list.size());
				while (it.hasPrevious()) {
				    result.add(it.previous());
				}
				 
				Collections.reverse(list);
				assertThat(result, equalTo(list));
		
	}	
}