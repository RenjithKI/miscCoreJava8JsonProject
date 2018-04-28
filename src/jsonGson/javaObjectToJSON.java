package jsonGson;
import com.google.gson.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Renjith
 *
 */
public class javaObjectToJSON {

	public static void main(String[] args) throws JsonIOException, IOException {
		//1.1 toJson() – Convert Java object to JSON
		
		Gson gson = new Gson();
		Staff obj = new Staff("Renjith", 34);
		
		//System.out.println("_______1________ " + gson);

		// 1. Java object to JSON, and save into a file
		//C:\ECLIPSEOXYGEN\WS\miscJava8Project\src\jsonGson\javaObjectToJSON2.java
		gson.toJson(obj, new FileWriter("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonGson\\file.json"));
		
		// 2. Java object to JSON, and assign to a String
		String jsonInString = gson.toJson(obj);
		System.out.println("_______1________ " + jsonInString);
		
		
		/*1.2 fromJson() – Convert JSON to Java object*/
		
		
		Gson gson2 = new Gson();

		// 1. JSON to Java object, read it from a file.
		Staff staff = gson2.fromJson(new FileReader("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonGson\\file2.json"), Staff.class);
		System.out.println("_______1________ " + staff.toString() );
		
		
		// 2. JSON to Java object, read it from a Json String.
		//String jsonInString2 = "{'name' : 'mkyong'}";//{"name":"Renjith","age":34}
		String jsonInString2 = "{'name' : 'neethu', 'age' : '34'}";
		Staff staff2 = gson2.fromJson(jsonInString2, Staff.class);
		
		System.out.println("_____staff2______ " + staff2.toString());
		
		// JSON to JsonElement, convert to String later.
		JsonElement json = gson2.fromJson(new FileReader("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonGson\\file2.json"),
				JsonElement.class);
	    String result = gson2.toJson(json);
	    
	    System.out.println("_____result____ " + result);

	}

}
