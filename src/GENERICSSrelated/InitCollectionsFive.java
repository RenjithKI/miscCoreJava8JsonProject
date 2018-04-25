package GENERICSSrelated;
import static GENERICSSrelated.InitCollectionsFiveCollectionUtils.Listof;

import java.util.List;
/**
 * @author Renjith
 *http://www.rgagnon.com/javadetails/java-0633.html
 */


/*Using Static import*/

public class InitCollectionsFive {

  public static void main(String args[]) {
    List<String> list = Listof("Bart", "Lisa", "Marge", "Homer", "Maggie");
    dump(list);
  }

  public static void dump(List<String> list) {
    for (String s:list) {
      System.out.println(s);
    }
  }
}