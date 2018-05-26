package javaCOLLECTIONSapis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**https://www.mkyong.com/java8/java-8-foreach-examples/
 * @author Renjith
 *
 */
public class List_ListOf_ForEach {

	public static void main(String[] args) {
		//List<String> items = new ArrayList<>();
		//items.add("12345");
		
		//List<String> items = List.of("first", "second");// java 9 version
		
		String arrays[] = { "11111"+ "22222"+ "33333"+ "44444"+ "55555"+ "66666"+ "77777"+ "88888"+ "99999" + "00000" +
							"12345"+ "23456"+ "34567"+ "45678"+ "56789"+ "67890"+ "78901"+ "89012"+ "901234"+ "01234" +
						    "10987"+ "21098"+ "32109"+ "43210"+ "54321"+ "65432"+ "76543"+ "87654"+ "98765" + "09876" 
						    };
		List<String> items = new ArrayList<>(Arrays.asList(arrays) );
		
		/*//Normal for-loop to loop a List.		
		for(String item : items){
			//System.out.println(item);
		}*/

		//lambda
		//Output : A,B,C,D,E
		//items.forEach(item->System.out.println(item));
			
		//Output : C
		items.forEach(item->{
			System.out.println("______@@@@@@@@@@@@@@@@@@@'________>"+item);
			if("11111".equals(item)){
				System.out.println("_____######################________>");
			}
		});
			
		//method reference
		//Output : A,B,C,D,E
		//items.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);

	}

}
