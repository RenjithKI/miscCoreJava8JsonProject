package zzzJackson2Convert_JavaObjectto_fromJSON;

import org.json.simple.JSONObject;

/**
 * @author Renjith
 *http://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
 *https://www.pluralsight.com/blog/tutorials/json-in-java
 *
 *
 *<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-core</artifactId>
    <version>2.9.5</version>
</dependency>

 */
public class aaaINTRO {

   public static void main(String[] args){
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
   }
}