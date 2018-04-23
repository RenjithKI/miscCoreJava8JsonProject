package zzInterviewQandAHashMap;

/**
 * @author Renjith
 * This class implements the Set interface, backed by a hash table (actually a HashMap instance).
 * 
 *  It makes no guarantees as to the iteration order of the set; in particular,
 *   it does not guarantee that the order will remain constant over time. 
 *   This class permits the null element. This class is not synchronized. 
 *   However it can be synchronized explicitly like this: 
 *   Set s = Collections.synchronizedSet(new HashSet(...));
 *   
 *   Points to Note about HashSet:

HashSet doesn’t maintain any order, the elements would be returned in any random order.
HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
HashSet allows null values however if you insert more than one nulls it would still return only one null value.
HashSet is non-synchronized.
The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException if HashSet has
 been modified after creation of iterator, by any means except iterator’s own remove method.
 *
 */
import java.util.HashSet;
public class HashSetExample {
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = 
               new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);

      //Displaying HashSet elements
      System.out.println(hset);
    }
}