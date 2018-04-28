package jsonGson;

/**https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
 * @author Renjith
 *
 */


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/*4. Java Object to JSON
Gson example to convert a Staff object into a JSON formatted string.*/
public class GsonExample {

    public static void main(String[] args) {

        Staff staff = createDummyObject();

        //1. Convert object to JSON string
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonGson\\newfile.json")) {

            gson.toJson(staff, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @return
     */
    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("Renjith");
        staff.setAge(30);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("spring");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;

    }

}