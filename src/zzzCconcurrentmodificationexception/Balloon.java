package zzzCconcurrentmodificationexception;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
 */
public class Balloon {

	private String color;

	public Balloon(){}
	
	public Balloon(String c){
		this.color=c;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
