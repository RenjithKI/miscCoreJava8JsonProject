package zzzJavaAndJSON;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

/**
 * @author Renjith
 *http://www.tutorialspoint.com/json/json_java_example.htm
 */
import org.json.simple.JSONObject;

public class Json2 {

   public static void main(String[] args) throws IOException{
	
      JSONObject obj = new JSONObject();

      obj.put("name","foo");
      obj.put("num",new Integer(100));
      obj.put("balance",new Double(1000.21));
      obj.put("is_vip",new Boolean(true));

      StringWriter out = new StringWriter();
      obj.writeJSONString(out);
      
      System.out.println(out);
      
      String jsonText = out.toString();
      System.out.println(jsonText);
   }
}