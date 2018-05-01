
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
public class aaaFromJsonToJavaObj01 {

	public static void main(String[] args) {
		aaaFromJsonToJavaObj01 obj = new aaaFromJsonToJavaObj01();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

	/*	Staff staff = createDummyObject();*/

		try {
			
			//String jsonInString = "{'name' : 'mkyong'}";

			//JSON from file to Object
			
			Staff obj = mapper.readValue(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\fileCopy.json"), Staff.class);

			//JSON from URL to Object
			//Staff obj2 = mapper.readValue(new URL("http://mkyong.com/api/staff.json"), Staff.class);

			//JSON from String to Object
			//Staff2 obj3 = mapper.readValue(jsonInString, Staff2.class);
			
			System.out.println(obj.toString());
			System.out.println("___________________________________________-");
			//System.out.println(obj3.toString());
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}