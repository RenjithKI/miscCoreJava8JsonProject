package GENERICSSrelated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Renjith
 * https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html
 * https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html
 *
 */
public class wildCard {
	
	void printCollection(Collection c) {
	    Iterator i = c.iterator();
	    for (int k = 0; k < c.size(); k++) {
	        System.out.println(i.next());
	    }
	}
	void printCollection2(Collection<Object> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}
	static //wild card usage
	void printCollectionwildcard(Collection<String> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		 ArrayList  list = new ArrayList();
		    list.add("Bart");
		    list.add(new Integer(100));
		    list.add("Marge");
		    list.add("Barney");
		    list.add("Homer");
		    list.add("Maggie");
		    
		    printCollectionwildcard(list);
		    
		   // dump(list);	
	/*public static void dump(List<String> list) {
	    for (String s:list) {
	      System.out.println(s);
	    }
	  }*/

}
}
	
