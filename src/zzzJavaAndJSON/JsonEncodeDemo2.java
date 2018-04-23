package zzzJavaAndJSON;

import java.io.InputStream;
import java.net.URL;

/**
 * @author Renjith
 *http://www.tutorialspoint.com/json/json_java_example.htm
 */
public class JsonEncodeDemo2 {

/*   public static void main(String[] args){
	   URL url = new URL("https://graph.facebook.com/search?q=java&type=post");
	   try (InputStream is = url.openStream();
	         JsonReader rdr = Json.createReader(is)) {
	   
	     JsonObject obj = rdr.readObject();
	        JsonArray results = obj.getJsonArray("data");
	        for (JsonObject result : results.getValuesAs(JsonObject.class)) {
	            System.out.print(result.getJsonObject("from").getString("name"));
	            System.out.print(": ");
	           System.out.println(result.getString("message", ""));
	         System.out.println("-----------");
	      }
	  }
   	}*/
  }
