package functionalPRogrammingSTREAMoperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * @author Renjith
 *http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
/**
 * In functional programming, a monad is a structure that represents computations
 *  defined as sequences of steps. A type with a monad structure defines what it means
 *   to chain operations,
 *  or nest functions of that type together.
 *
 */
public class monad {
	
	@Test
	public void test1() {
		//System.out.println("____________test 1_____________ below ");
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .forEachOrdered(System.out::println);
			    //.forEach(System.out::println);

			// C1
			// C2
			System.out.println("_________________________> ");
	}
	
	@Test
	public void test2() {
		Arrays.asList("a1", "a2", "a3")
	    .stream()
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
	}
	
	@Test
	public void test3() {
		Stream.of("a1", "a2", "a3")
	    .findFirst()
	    .ifPresent(System.out::println);  // a1
	}
	
	@Test
	public void test4() {
		IntStream.range(1, 4)
	    .forEach(System.out::println);

	// 1
	// 2
	// 3
	}
	
	@Test
	public void test5() {
		System.out.println("_________________________> ");
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)//3,+ 5,+ 7  = 15
	    .average()
	    .ifPresent(System.out::print);  // 5.0
		
		
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .forEach(System.out::println);
	}
	
	@Test
	public void test6() {
		Stream.of("a1", "a2", "a3")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println);  // 3
	}
	
	@Test
	public void test7() {
		IntStream.range(1, 4)
	    .mapToObj(i -> "a" + i)
	    .forEach(System.out::println);

	// a1
	// a2
	// a3
	}
	
	@Test
	public void test8() {
		Stream.of(1.0, 2.0, 3.0)
	    .mapToInt(Double::intValue)
	    .mapToObj(i -> "a" + i)
	    .forEach(System.out::println);

	// a1
	// a2
	// a3	
	}
	
	@Test
	public void test9() {
		System.out.println("______________test 9___________#> ");
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    });
		System.out.println("______________test 9___________#> ");
	}
	
	
	@Test
	public void test10() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return true;
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}
	
	@Test
	public void test11() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .anyMatch(s -> {
	        System.out.println("anyMatch: " + s);
	        return s.startsWith("A");
	    });

	// map:      d2
	// anyMatch: D2
	// map:      a2
	// anyMatch: A2
	}
	
	@Test
	public void test12() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	// map:     d2
	// filter:  D2
	// map:     a2
	// filter:  A2
	// forEach: A2
	// map:     b1
	// filter:  B1
	// map:     b3
	// filter:  B3
	// map:     c
	// filter:  C
	}
	
	@Test
	public void test13() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	// filter:  d2
	// filter:  a2
	// map:     a2
	// forEach: A2
	// filter:  b1
	// filter:  b3
	// filter:  c
	}

	@Test
	public void test114() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));	
	}
	
	@Test
	public void test15() {
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));

	// filter:  d2
	// filter:  a2
	// filter:  b1
	// filter:  b3
	// filter:  c
	// map:     a2
	// forEach: A2
	}

	@Test
	public void test16() {
		Stream<String> stream =
			    Stream.of("d2", "a2", "b1", "b3", "c")
			        .filter(s -> s.startsWith("a"));

			stream.anyMatch(s -> true);    // ok
			//stream.noneMatch(s -> true);   // exception	
	}
	
	@Test
	public void test17() {
		Supplier<Stream<String>> streamSupplier =
			    () -> Stream.of("d2", "a2", "b1", "b3", "c")
			            .filter(s -> s.startsWith("a"));

			streamSupplier.get().anyMatch(s -> true);   // ok
			streamSupplier.get().noneMatch(s -> true);  // ok
	}
	
/*Advanced operations*/
/*Advanced operations*/
	
	@Test
	public void test18() {
		class Person {
		    String name;
		    int age;

		    Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    @Override
		    public String toString() {
		        return name;
		    }
		}

		List<Person> persons =
		    Arrays.asList(
		        new Person("Max", 18),
		        new Person("Peter", 23),
		        new Person("Pamela", 23),
		        new Person("David", 12));
	}
	
	@Test
	public void test19() {
		
	}
	
	@Test
	public void test20() {
		
	}
	
	@Test
	public void test21() {
		
	}
	
	@Test
	public void test22() {
		
	}
	
	@Test
	public void test23() {
		
	}
	
	@Test
	public void test24() {
		
	}
	
	@Test
	public void test25() {
		
	}
	
	@Test
	public void test26() {
		
	}
	
	@Test
	public void test27() {
		
	}
	
	@Test
	public void test28() {
		
	}
	
	@Test
	public void test29() {
		
	}


}
