package zzzJackson2Convert_JavaObjectto_fromJSON;

import java.util.ArrayList;
import java.util.List;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class toIntArray1 {
	
    /*
     * Complete the oddNumbers function below.
     */
    static int[] oddNumbers(int l, int r) {
    	
    	int[]  ansss = null;        
        List result = new ArrayList<>();
        
        int[] anss = null;
        for (int i = l; i < r+1; i++) {
           if (i%2==1){ result.add(i);	}
		}
       /* if (result.size()==0) { return null;}*/
            
        
        for (int i = 0; i < result.size(); i++) {
        	ansss = new int[result.size()];
     	   anss[i]= (int) result.get(i);
			}
        return ansss;

    }

	public static void main(String[] args) {
		 
			 
			 int[] object;
			 object = oddNumbers(2, 10);		       
		    }

	}
