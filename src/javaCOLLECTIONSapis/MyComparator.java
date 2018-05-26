package javaCOLLECTIONSapis;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
	@Override
	   public int compare(String x, String y)
	   {
	      return x.length() - y.length();
	   }

}
