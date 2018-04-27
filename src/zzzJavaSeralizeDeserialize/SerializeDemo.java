package zzzJavaSeralizeDeserialize;

/**https://www.tutorialspoint.com/java/java_serialization.htm
 * @author Renjith
 *
 */
import java.io.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         FileOutputStream fileOut =
        		 //absolute path
         //new FileOutputStream("C:\\ECLIPSEOXYGEN\\miscSerializedObject\\employee.ser"); //"\\tmp\\employee.ser"
        		 //relative path
         new FileOutputStream("employee.ser"); //"\\tmp\\employee.ser"
         /*"tmp/employee.ser"
          * C:\ECLIPSEOXYGEN\miscSerializedObject
          * */
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}