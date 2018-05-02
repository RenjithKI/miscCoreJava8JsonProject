package jsonJackson;

/**
 * @author Renjith
 *http://www.mkyong.com/java/jackson-tree-model-example/
 */

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTreeModel_topNode_array {

	public static void main(String[] args) {

		try {
			long id;
			String firstName = "";
			String middleName = "";
			String lastName = "";

			ObjectMapper mapper = new ObjectMapper();
			//2.2 The concept is same, just loops the first node.
			JsonNode rootArray  = mapper.readTree(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\user2.json"));
			/*[
 {
  "id"   : 1,
  "name" : {
    "first" : "Yong",
    "last" : "Mook Kim" 
  },
  "contact" : [
    { "type" : "phone/home", "ref" : "111-111-1234"},
    { "type" : "phone/work", "ref" : "222-222-2222"}
  ]
},
{
  "id"   : 2,
  "name" : {
    "first" : "Yong",
    "last" : "Zi Lap" 
  },
  "contact" : [
    { "type" : "phone/home", "ref" : "333-333-1234"},
    { "type" : "phone/work", "ref" : "444-444-4444"}
  ]
}
]*/
			for(JsonNode root : rootArray){
			
			// Get id
			id = root.path("id").asLong();
			System.out.println("id : " + id);

			// Get Name
			JsonNode nameNode = root.path("name");
			if (nameNode.isMissingNode()) {
				// if "name" node is missing
			} else {

				firstName = nameNode.path("first").asText();
				// missing node, just return empty string
				middleName = nameNode.path("middle").asText();
				lastName = nameNode.path("last").asText();

				System.out.println("firstName : " + firstName);
				System.out.println("middleName : " + middleName);
				System.out.println("lastName : " + lastName);

			}

			// Get Contact
			JsonNode contactNode = root.path("contact");
			if (contactNode.isArray()) {
				// If this node an Arrray?
			}

			for (JsonNode node : contactNode) {
				String type = node.path("type").asText();
				String ref = node.path("ref").asText();
				System.out.println("type : " + type);
				System.out.println("ref : " + ref);

			}
			
			System.out.println("end of loop_________________________");
			}//for loop of root array

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}