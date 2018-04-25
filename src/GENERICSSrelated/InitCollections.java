package GENERICSSrelated;

import java.util.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Renjith
 *http://www.rgagnon.com/javadetails/java-0633.html
 *http://www.rgagnon.com/javadetails/java-0633.html
 */
public class InitCollections {
	@Test
	/*regular way*/
	public void test1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bart");
		list.add("Lisa");
		list.add("Marge");
		list.add("Barney");
		list.add("Homer");
		list.add("Maggie");
		dump(list);
	}
	/*Use Arrays.asList()*/
	@Test
	public void test2() {
		 List list = Arrays.asList("Bart", "Lisa", "Marge", "Homer", "Maggie");
		    dump(list);
		
	}
	@Test
	public void test3() {
		
	}
	@Test
	public void test4() {
		
	}
	@Test
	public void test5() {
		
	}
	

		public static void dump(List<String> list) {
			for (String s:list) {
				System.out.println(s);
			}
		}
	}