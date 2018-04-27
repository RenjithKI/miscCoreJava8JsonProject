package zzzJavaSeralizeDeserialize;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
/**
 * @author Renjith
 *https://coderanch.com/t/637414/java/Serialized-Objects-stored
 */
public class NameStore implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5371263062496185925L;
	private String firstName;
    private transient String middleName;// will be lost in deserialied recovery
    private String lastName;
 
    public NameStore(String fName, String mName, String lName) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
    }
 
    public static void main(String args[]) throws Exception {
        NameStore nameStore = new NameStore("Steve", "Middle", "Jobs");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(
                "nameStore"));
        // writing to object
        o.writeObject(nameStore);
        o.close();
 
        // reading from object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                "nameStore"));
        NameStore nameStore1 = (NameStore) in.readObject();
        System.out.println(nameStore1.firstName);
        System.out.println(nameStore1.lastName);
        System.out.println(nameStore1.middleName);
    }
 
}
