package javaCOLLECTIONSapis;

import java.util.HashMap;
import java.util.Map;

/**https://www.mkyong.com/java8/java-8-foreach-examples/
 * @author Renjith
 *http://www.mkyong.com/tutorials/java-8-tutorials/
 */
public class Map_ForEach {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		
		//_________________part 2____________
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});

	}

}
