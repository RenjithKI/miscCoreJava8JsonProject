
package jsonJackson;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Renjith
 * 
 *
 */


/**
 * @author Renjith
 * 4. Java Object to JSON
Convert a Staff object into a JSON formatted string.
 */
public class aaaFromJsonToJavaObj00 {

	public static void main(String[] args) {
		aaaFromJsonToJavaObj00 obj = new aaaFromJsonToJavaObj00();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

	/*	Staff staff = createDummyObject();*/

		try {
			
			String jsonInString = "{'name' : 'mkyong'}";

			//JSON from file to Object
			Staff obj = mapper.readValue(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\file.json"), Staff.class);

			//JSON from URL to Object
			//Staff obj2 = mapper.readValue(new URL("http://mkyong.com/api/staff.json"), Staff.class);

			//JSON from String to Object
			//Staff obj3 = mapper.readValue(jsonInString, Staff.class);
			
			System.out.println(obj.toString());
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}