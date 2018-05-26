package javaCOLLECTIONSapis;

/**https://beginnersbook.com/2014/07/hashtable-in-java-with-example/
 * @author Renjith
 *
 */
import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","Chaitanya");
   hashtable.put("Key2","Ajeet");
   hashtable.put("Key3","Peter");
   hashtable.put("Key4","Ricky");
   hashtable.put("Key5","Mona");
   //hashtable.put(null, "Anuj2");
   System.out.println("___################___"+hashtable.put("Key3", "Anuj33") );
   System.out.println("___################___"+hashtable.put("Key3", "Anuj44") );
 
   names = hashtable.keys();
   System.out.println("___names___"+names.toString());
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}