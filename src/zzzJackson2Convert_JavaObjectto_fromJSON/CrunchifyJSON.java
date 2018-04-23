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

import static org.junit.Assert.assertTrue;


import java.util.stream.Stream;

import org.junit.Test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
 
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
 
/**
 * @author Renjith
 *
 */
public class CrunchifyJSON {
 
	public static void main(String[] args) {
 
		String jsonString = callURL("https://cdn.crunchify.com/wp-content/uploads/code/jsonArray.txt");
		System.out.println("\n\njsonString: " + jsonString);
		/*for (int i = 0; i < args.length; i++) {
			
		}*/
 
// Replace this try catch block for all below subsequent examples
		try {  
			JSONArray jsonArray = new JSONArray(jsonString);
			System.out.println("\n\njsonArray: ___>" + jsonArray);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
 
	public static String callURL(String myURL) {
		System.out.println("Requested URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		} 
 
		return sb.toString();
	}
 
}