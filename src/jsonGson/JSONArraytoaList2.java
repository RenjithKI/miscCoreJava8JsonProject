package jsonGson;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 * @author Renjith
 *
 */
public class JSONArraytoaList2 {

	public static void main(String[] args) {
		// 6.1 Convert a JSON to a Map
		Gson gson = new Gson();
		String json = "{\"name\":\"renji\", \"age\":30}";
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		map.forEach((x,y)-> System.out.println("key : " + x + " , value : " + y));

	}

}
