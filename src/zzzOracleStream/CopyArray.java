package zzzOracleStream;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *https://stackoverflow.com/questions/16748030/difference-between-arrays-aslistarray-and-new-arraylistintegerarrays-aslist
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CopyArray {

    public static void main(String[] args) {
        List<Integer> list1, list2 = null;
        Integer[] intarr = { 3, 4, 2, 1 };
        list1 = new ArrayList<Integer>(Arrays.asList(intarr));
        list1.add(30);
        list2 = Arrays.asList(intarr);
        // list2.add(40); Here, we can't modify the existing list,because it's a wrapper
        System.out.println("List1");
        Iterator<Integer> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("List2");
        Iterator<Integer> itr2 = list2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
