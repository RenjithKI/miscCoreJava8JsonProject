package javaCOLLECTIONSapis;

/**https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
 * @author Renjith
 *LinkedList is a doubly-linked list implementation of the List and Deque interfaces. 
 *LinkedList allows for constant-time insertions or removals using iterators, 
 *but only sequential access of elements. In other words, LinkedList can be searched forward
 * and backward but the time it takes to traverse the list is directly proportional to the 
 * size of the list.
 */
import java.util.LinkedList;;
public class LinkedListExample {
     public static void main(String args[]) {

       /* Linked List Declaration */
       LinkedList<String> linkedlist = new LinkedList<>();

       /*add(String Element) is used for adding 
        * the elements to the linked list*/
       linkedlist.add(0,"Item1");
       linkedlist.add("Item5");
       linkedlist.add("Item3");
       linkedlist.add("Item6");
       linkedlist.add("Item2");

       /*Display Linked List Content*/
       System.out.println("Linked List Content: " +linkedlist);

       /*Add First and Last Element*/
       linkedlist.addFirst("First Item");
       linkedlist.addLast("Last Item");
       System.out.println("LinkedList Content after addition: " +linkedlist);

       /*This is how to get and set Values*/
       Object firstvar = linkedlist.get(0);
       System.out.println("First element: " +firstvar);
       linkedlist.set(0, "Changed first item");
       Object firstvar2 = linkedlist.get(0);
       System.out.println("First element after update by set method: " +firstvar2);

       /*Remove first and last element*/
       linkedlist.removeFirst();
       linkedlist.removeLast();
       System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

       /* Add to a Position and remove from a position*/
       linkedlist.add(0, "Newly added item");
       linkedlist.remove(2);
       System.out.println("Final Content: " +linkedlist); 
     }
}
