package GENERICSSrelated;

import java.util.List;
import java.util.ArrayList;


public class InitCollections2 {
	/*using static initializer*/
  static ArrayList<String> list = new ArrayList<String>();

  static {
    list.add("Bart");
    list.add("Lisa");
    list.add("Marge");
    list.add("Barney");
    list.add("Homer");
    list.add("Maggie");
  }
  public static void main(String args[]) {
    dump(list);
  }

  public static void dump(List<String> list) {
    for (String s:list) {
      System.out.println(s);
    }
  }
}
