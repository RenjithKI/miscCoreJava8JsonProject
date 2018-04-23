package zzzCconcurrentmodificationexception;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class staticExample
{
	  static int value1 = 5;
	
	 // value1= 2;
	//can be changed by using Example.value1= anyvalue;
	 
	  final int VALUE = 10; 
	//cannot be changed as it is constant and cannot be used without creating instance of class Example.
	   
	  static final int value3 = 18;
	//cannot be changed but can be accessed using Example.value3;
	  
	  
	  public static void main(String[] args) {
		  value1= 2;
		  System.out.println(value1);
		  
		 // VALUE= 10;
		 // System.out.println(VALUE);
		  
		  /*value3= 3;
		  System.out.println(value3);
*/	}
}

