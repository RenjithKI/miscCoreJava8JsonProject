package javaCOLLECTIONSapis;

/**https://beginnersbook.com/2013/12/java-arraylist/
 * @author Renjith
 * Arraylist class implements List interface. It is widely used because of the functionality
 *  and flexibility it offers. Most of the developers choose Arraylist over Array as it’s a 
 *  very good alternative of traditional java arrays. ArrayList is a resizable-array 
 *  implementation of the List interface. It implements all optional list operations, 
 *  and permits all elements, including null.

The issue with arrays is that they are of fixed length so if it is full you cannot add
 any more elements to it, likewise if there are number of elements gets removed from it the memory consumption would be the same as it doesn’t shrink. On the other ArrayList can dynamically grow and shrink after addition and removal of elements. Apart from these benefits ArrayList class enables us to use predefined methods of it which makes our task easy. 
Let’s see the ArrayList example first then we will discuss it’s methods and their usage.
 *
 */
import java.util.*;
//
public class ArrayListExample2 {
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  
	   List<String> obj = new ArrayList<>();
	  
	 // List obj = Collections.synchronizedList(new ArrayList<String>() ) ;

	  /*This is how elements should be added to the array list*/
	  obj.add("Ajeet");
	  obj.add("Harry");
	  obj.add("Chaitanya");
	  obj.add("Steve");
	  obj.add("Anuj");
	  System.out.println("___>"+obj.add("Anuj") );
	  System.out.println("___>"+obj.add("Renjth") );
	//  System.out.println("___>"+obj.add(000) );

	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+obj);

	  /*Add element at the given index*/
	  obj.add(0, "Rahul");
	  obj.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  System.out.println("________remove___________->" + obj.remove("Chaitanya") );
	  System.out.println("________remove___________->" + obj.remove("xxxx") );
	  System.out.println("________remove___________->" + obj.remove(0) );
	  obj.remove("Harry");

	  System.out.println("Current array list is:"+obj);

	  /*Remove element from the given index*/
	  obj.remove(1);

	  System.out.println("Current array list is:"+obj);
   }
}