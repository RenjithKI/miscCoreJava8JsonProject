package zzInterviewQandAHashMap;

/**
 * @author Renjith
 *Earlier we have shared tutorials on HashSet and TreeSet. 
 *LinkedHashSet is also an implementation of Set interface, 
 *it is similar to the HashSet and TreeSet except the below mentioned differences:

HashSet doesn’t maintain any kind of order of its elements.
TreeSet sorts the elements in ascending order.
LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence 
in which they have been added to the Set.
 */
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String args[]) {
        // LinkedHashSet of String Type
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("O");
        lhset.add("KK");
        lhset.add("FGH");
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(7);
        lhset2.add(0);
        lhset2.add(67);
        lhset2.add(89);
        lhset2.add(66);
        System.out.println(lhset2);
   }
}