package zzzJackson2Convert_JavaObjectto_fromJSON;

import java.util.ArrayList;
import java.util.List;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class toIntArray {
	
    /*
     * Complete the oddNumbers function below.
     */
    static int[] oddNumbers(int l, int r) {
        
        List result = new ArrayList<>();
        int[] anss = null;
        
        int total = 5;// get the total from the json object total value
     
       for (int i = l; i < r+1; i++) {
           if (i%2==1){
           result.add(i);	
           System.out.println("____>"+i);
               }
		}
        if (result.size()!=0)
        	{
			           anss = new int[result.size()];
			           for (int i = 0; i < anss.length; i++) {
			        	   anss[i]= (int) result.get(i);
						}
        	}
        return anss;
    }

	public static void main(String[] args) {
		 
			 
			 int[] object;
			 object = oddNumbers(2, 10);	
			 System.out.println(object.toString());
			 
			 for (int i = 0; i < object.length; i++) {
				 System.out.println(object[i]);
				}
		    }

	}
