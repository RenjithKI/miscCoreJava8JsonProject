package GENERICSSrelated;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Renjith
 *http://www.rgagnon.com/javadetails/java-0633.html
 */
public class InitCollectionsHHH3 {
  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Bart");
    list.add("Lisa");
    list.add("Marge");
    list.add("Barney");
    list.add("Homer");
    list.add("Maggie");
    dump(list);
  }

  public static void dump(List<String> list) {
    for (String s:list) {
      System.out.println(s);
    }
  }
}