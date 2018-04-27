package zzzOracleStreamTechNetwork;

import java.util.ArrayList;
/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class technetworkStream1 {
	private static final String BLUE = "BLUE";
	private static final String RED = "RED";
	private static final String GREEN = "GREEN";
	

	public static void main(String[] args) {
		 ArrayList<Shape> shapes = new ArrayList<Shape>();
			Shape shape1 = new Shape("BLUE", "square");
			Shape shape2 = new Shape("RED", "circle");
			Shape shape3 = new Shape("GREEN", "recagle");
			
			shapes.add(shape1);
			shapes.add(shape2);
			shapes.add(shape3);
			
			/*To demonstrate how the new lambdas feature works, 
			 * here is a short snippet of code that iterates
			 *  through a list of shapes and changes the blue ones to red:*/

				for (Shape s : shapes) {
				  if (s.getColor() == BLUE)
				    s.setColor(RED);
				}

				/*In Java SE 8, you could rewrite the same code by using
				 *  a forEach and a lambda expression, as follows:*/

				shapes.forEach(s -> {
				   if (s.getColor() == BLUE)
				     s.setColor(RED);
				 });


	}

}
