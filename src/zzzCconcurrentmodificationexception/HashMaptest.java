package zzzCconcurrentmodificationexception;

import java.util.HashMap;
import java.util.Map;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class HashMaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> testMap = new HashMap<String, String>();
		 
		System.out.println(testMap.put("key1", "val1"));
		 
		System.out.println(testMap.put("key1", "val2"));
		 
		System.out.println(testMap.put("key1", null));

	}

}
