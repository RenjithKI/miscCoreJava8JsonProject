package jsonGson;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 * @author Renjith
 *
 */
public class JSONArraytoaList {

	public static void main(String[] args) {
		// 6.1 Convert a JSON Array to a List, using TypeToken
		Gson gson = new Gson();
		String json = "[{\"name\":\"renjith\"}, {\"name\":\"laplap\"}]";
		List<Staff> list = gson.fromJson(json, new TypeToken<List<Staff>>(){}.getType());
		list.forEach(x -> System.out.println(x));

	}

}
