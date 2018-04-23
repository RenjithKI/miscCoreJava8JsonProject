package zzInterviewQandAHashMap;

/**
 * @author Renjith
 * TreeSet is similar to HashSet except that it sorts the elements in the ascending order 
 * while HashSet doesn’t maintain any order. TreeSet allows null element but like HashSet it doesn’t allow. 
 * Like most of the other collection classes this class is also not synchronized, 
 * however it can be synchronized explicitly like this:
 *  SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));
 *
 */
import java.util.TreeSet;
public class TreeSetExample {
     public static void main(String args[]) {
         // TreeSet of String Type
         TreeSet<String> tset = new TreeSet<String>();

         // Adding elements to TreeSet<String>
         tset.add("ABC");
         tset.add("String");
         tset.add("Test");
         tset.add("Pen");
         tset.add("Ink");
         tset.add("Jack");

         //Displaying TreeSet
         System.out.println(tset);

         // TreeSet of Integer Type
         TreeSet<Integer> tset2 = new TreeSet<Integer>();

         // Adding elements to TreeSet<Integer>
         tset2.add(88);
         tset2.add(7);
         tset2.add(101);
         tset2.add(0);
         tset2.add(3);
         tset2.add(222);
         System.out.println(tset2);
    }
 }