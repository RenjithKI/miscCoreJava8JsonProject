package GENERICSSrelated;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Renjith
 *http://www.rgagnon.com/javadetails/java-0633.html
 */

	import java.util.List;
	import java.util.Arrays;
	public class InitCollections4 {

	  public static void main(String args[]) {
	    List list = Arrays.asList("Bart", "Lisa", "Marge", "Homer", "Maggie");
	    dump(list);
	  }

	  public static void dump(List<String> list) {
	    for (String s:list) {
	      System.out.println(s);
	    }
	  }
	}
