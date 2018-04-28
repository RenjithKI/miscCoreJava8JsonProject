package jsonJackson;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/*import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;*/
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 * @author Renjith
 *
 *https://www.mkyong.com/java8/java-8-foreach-examples/
 */
public class JacksonJSONArraytoMAP {

	public static void main(String[] args) {
		// 6.1 Convert a JSON Array to a List, using TypeToken
		ObjectMapper mapper = new ObjectMapper();
		
		//String json = "[{\"name\":\"renjith\"}, {\"name\":\"laplap\"}]";
		String json = "{\"name\":\"renjith\", \"age\":33}";
		Map<String, Object> map= null;
		try {
			map = mapper.readValue(json, new TypeReference<Map<String,Object>>(){});
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		map.forEach((k,v) -> System.out.println("Item key-: " + k + " value- : " + v));

	}

}
