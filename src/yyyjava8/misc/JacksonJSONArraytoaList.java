package yyyjava8.misc;

import java.io.IOException;
import java.util.List;

/*import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;*/
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 * @author Renjith
 *
 */
public class JacksonJSONArraytoaList {

	public static void main(String[] args) {
		// 6.1 Convert a JSON Array to a List, using TypeToken
		ObjectMapper mapper = new ObjectMapper();
		
		String json = "[{\"name\":\"renjith\"}, {\"name\":\"laplap\"}]";
		List<Staff> list = null;
		try {
			list = mapper.readValue(json, new TypeReference<List<Staff>>(){});
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(x -> System.out.println(x));

	}

}
