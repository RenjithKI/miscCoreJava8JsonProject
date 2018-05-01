
package jsonJackson;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author Renjith
 * 4. Java Object to JSON
Convert a Staff object into a JSON formatted string.

http://www.baeldung.com/jackson-deserialize-json-unknown-properties

 */
public class aaaFromJsonToJavaObj4 {

	public static void main(String[] args) {
		aaaFromJsonToJavaObj4 obj = new aaaFromJsonToJavaObj4();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper 
			//= new ObjectMapper();
			=new ObjectMapper()
		  .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		try {
			//JSON from file to Object
			
			Car2 obj = mapper.readValue(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\fileCar2.json"), Car2.class);

			//JSON from URL to Object
			//Staff obj2 = mapper.readValue(new URL("http://mkyong.com/api/staff.json"), Staff.class);
			//JSON from String to Object
			//Staff2 obj3 = mapper.readValue(jsonInString, Staff2.class);
			
			System.out.println(obj.toString());
			System.out.println("____________________>"+ obj.getName());
			
			
			
			
			
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}

