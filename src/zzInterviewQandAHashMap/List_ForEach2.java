package zzInterviewQandAHashMap;

import java.util.ArrayList;
import java.util.List;

/**https://www.mkyong.com/java8/java-8-foreach-examples/
 * @author Renjith
 *
 */
public class List_ForEach2 {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");		
		
		
		//Normal for-loop to loop a List.		
		for(String item : items){
			System.out.println(item);
		}

		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
			
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
		
		//Output : C
				items.forEach(item->{ if("C".equals(item)){	System.out.println(item); }	 });
			
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);

	}

}
