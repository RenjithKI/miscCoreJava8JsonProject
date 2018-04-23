package zzzJackson2Convert_JavaObjectto_fromJSON;
/**
 * <!-- https://mvnrepository.com/artifact/org.json/json -->
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20180130</version>
</dependency>

 *
 */
/**
 * @author Renjith
 * https://crunchify.com/json-manipulation-in-java-examples/
 *
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray; 
/**
 * @author Renjith
 *
 */
public class CrunchifyJSON2 {
 
	public static void main(String[] args) {
		
		String jsonString = CrunchifyJSON.callURL("https://cdn.crunchify.com/wp-content/uploads/code/jsonArray.txt");
		System.out.println("\n\njsonString: " + jsonString);
 
// Replace this try catch block for all below subsequent examples
 
		try {
			JSONArray jsonArray = new JSONArray(jsonString);
 
			int count = jsonArray.length(); // get totalCount of all jsonObjects
			for(int i=0 ; i< count; i++){   // iterate through jsonArray 
				JSONObject jsonObject = jsonArray.getJSONObject(i);  // get jsonObject @ i position 
				System.out.println("jsonObject " + i + ": " + jsonObject);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
 
}