package GENERICSSrelated;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Renjith
 *
 */
public class InitCollections3 {
/*Using the Double Brace Initialization.
Careful with this one because it can cause memory leak*/
  static ArrayList<String> list = new ArrayList<String>() {{
    add("Bart");
    add("Lisa");
    add("Marge");
    add("Barney");
    add("Homer");
    add("Maggie");
  }};

  public static void main(String args[]) {
    dump(list);
  }

  public static void dump(List<String> list) {
    for (String s:list) {
      System.out.println(s);
    }
  }
}
