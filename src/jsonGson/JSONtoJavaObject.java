package jsonGson;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.*;
/*import com.google.gson.*;
import com.google.gson.*;*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Renjith
 *
 */
public class JSONtoJavaObject {

	public static void main(String[] args) throws JsonIOException, IOException {
		//1.1 toJson() – Convert Java object to JSON
		
		Gson gson = new Gson();
		Staff obj = new Staff();
		
		System.out.println("_______1________ " + gson);

		// 1. Java object to JSON, and save into a file
		gson.toJson(obj, new FileWriter("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\file.json"));//C:\ECLIPSEOXYGEN\WS\miscJava8Project\src
		
		// 2. Java object to JSON, and assign to a String
		String jsonInString = gson.toJson(obj);
		
		
		/*1.2 fromJson() – Convert JSON to Java object*/
		
		
		Gson gson2 = new Gson();

		// 1. JSON to Java object, read it from a file.
		Staff staff = gson2.fromJson(new FileReader("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\file2.json"), Staff.class);

		// 2. JSON to Java object, read it from a Json String.
		String jsonInString2 = "{'name' : 'mkyong'}";
		Staff staff2 = gson2.fromJson(jsonInString2, Staff.class);
		
		System.out.println("_______2________ " + staff2.toString());
		
		// JSON to JsonElement, convert to String later.
		JsonElement json = gson2.fromJson(new FileReader("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\file2.json"), JsonElement.class);
	    String result = gson2.toJson(json);

	}

}
