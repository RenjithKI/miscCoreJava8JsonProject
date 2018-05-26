package functionalPRogrammingSTREAMoperation;

import java.util.Arrays;
import java.util.List;

/**
 * @author Renjith
 *http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
public class Person {
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
    
    
    //
     static List<Person> yieldPersonlist(){
    List<Person> persons =
    	    Arrays.asList(
    	        new Person("Max", 18),
    	        new Person("Peter", 23),
    	        new Person("Pamela", 23),
    	        new Person("David", 12));
	return persons;
    }
}


