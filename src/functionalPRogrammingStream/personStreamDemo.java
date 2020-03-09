package functionalPRogrammingStream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class personStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = PersonRepo.persons;
		
		List<Person> filtered = persons
			        .stream()
			        .filter(p -> p.name.startsWith("P"))
			        .collect(Collectors.toList());

			System.out.println(filtered);    // [Peter, Pamela]
			// stringOptional.ifPresent(System.out::println);
			filtered.forEach(System.out::println);
			
			System.out.println("_______________________-");
			//
			
			
			
			Map<?, List<Person>> personsByAge = persons
				    .stream()
				    .collect(Collectors.groupingBy(p -> p.age));

				personsByAge
				    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

				// age 18: [Max]
				// age 23: [Peter, Pamela]
				// age 12: [David]
				
				
				Double averageAge = persons
					    .stream()
					    .collect(Collectors.averagingInt(p -> p.age));

				System.out.println(averageAge);     // 19.0
				
				//

	}

}
