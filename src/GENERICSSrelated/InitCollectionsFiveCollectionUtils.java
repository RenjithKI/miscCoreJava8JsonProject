package GENERICSSrelated;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Renjith
 *http://www.rgagnon.com/javadetails/java-0633.html
 */


import java.util.Arrays;
import java.util.List;

public class InitCollectionsFiveCollectionUtils {
  public static <T> List<T> Listof(T...elems){
    return Arrays.asList( elems );
  }
}