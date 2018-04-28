package zzzOracleStreamTechNetwork;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class runn {

	public static void main(String[] args) {
		Runnable runn = () -> { for (int i =0; i< 1000; i++) System.out.println("HAIIIIIIIIIIIIIII"); };
		new Thread(runn).start();

	}

}
