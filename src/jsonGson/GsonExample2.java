package jsonGson;

/**https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 * @author Renjith
 *
 */


import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/*4. Java Object to JSON
Gson example to convert a Staff object into a JSON formatted string.*/
@SuppressWarnings("unused")
public class GsonExample2 {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader
        		("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonGson\\newfile.json")) {

			// Convert JSON to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

			// Convert JSON to JsonElement, and later to String
            /*JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
