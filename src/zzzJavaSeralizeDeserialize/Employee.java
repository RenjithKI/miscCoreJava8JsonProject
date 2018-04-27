package zzzJavaSeralizeDeserialize;

/**https://www.tutorialspoint.com/java/java_serialization.htm
 * @author Renjith
 *
 */
public class Employee implements java.io.Serializable {
	/**
	 * The class must implement the java.io.Serializable interface.
All of the fields in the class must be serializable. If a field is not serializable,
 it must be marked transient.
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}