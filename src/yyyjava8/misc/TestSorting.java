package yyyjava8.misc;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author Renjith
 *
 */
public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort..................");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
	//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		System.out.println("After Sort........age..........");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
/*	_________________________________________- */
		//sort by Salary
		
				Collections.sort(listDevs, new Comparator<Developer>() {
					@Override
					public int compare(Developer o1, Developer o2) {
						return (o1.getSalary()).intValue() - (o2.getSalary()).intValue();
					}
				});
				
				System.out.println("After Sort.........salary.........");
				for (Developer developer : listDevs) {
					System.out.println(developer);
				}
				
				//sort by name length
				Collections.sort(listDevs, new Comparator<Developer>() {
					@Override
					public int compare(Developer o1, Developer o2) {
						return (o1.getName()).length() - (o2.getName()).length();
					}
				});
				
				System.out.println("After Sort.........name.length.........");
				for (Developer developer : listDevs) {
					System.out.println(developer);
				}
				
		
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("renjith", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));		
		return result;

	}
	
}