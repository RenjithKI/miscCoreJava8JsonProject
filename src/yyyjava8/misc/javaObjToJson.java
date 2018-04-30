
package yyyjava8.misc;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Renjith
 * added jackson databind jar here
 * Exception in thread "main" java.lang.NoClassDefFoundError: com/fasterxml/jackson/annotation/JsonView
	at com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.<clinit>(JacksonAnnotationIntrospector.java:37)
	at com.fasterxml.jackson.databind.ObjectMapper.<clinit>(ObjectMapper.java:291)
	at jsonJackson.Jackson2Example.run(Jackson2Example.java:27)
	at jsonJackson.Jackson2Example.main(Jackson2Example.java:23)
Caused by: java.lang.ClassNotFoundException: com.fasterxml.jackson.annotation.JsonView
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 4 more
 *
 */


/**
 * @author Renjith
 * 4. Java Object to JSON
Convert a Staff object into a JSON formatted string.
 */
public class javaObjToJson {

	public static void main(String[] args) {
		javaObjToJson obj = new javaObjToJson();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		Staff staff = createDummyObject();

		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File(
					"C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\file.json"), staff);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(staff);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Staff createDummyObject() {

		Staff staff = new Staff();

		staff.setName("Renjith");
		staff.setAge(30);
		staff.setPosition("Developer");
		staff.setSalary(new BigDecimal("00000"));

		List<String> skills = new ArrayList<>();
		skills.add("java");
		skills.add("python");

		staff.setSkills(skills);

		return staff;

	}

}