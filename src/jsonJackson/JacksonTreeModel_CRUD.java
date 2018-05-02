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
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
/*3. TreeModel CRUD Example
3.1 This example, show you how to create, update and remove nodes (ObjectNode and ArrayNode). Read the comments for self-explanatory.

* JsonNode root = mapper.readTree(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\userCRUD.json"));
*/
public class JacksonTreeModel_CRUD {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();
			/*	Staff obj = mapper.readValue(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\file.json"), Staff.class);  */
			JsonNode root = mapper.readTree(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\userCRUD.json"));

			String resultOriginal = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
			System.out.println("Before Update " + resultOriginal);

			// 1. Update id to 1000
			((ObjectNode) root).put("id", 1000L);

			// 2. If middle name is empty , update to M
			JsonNode nameNode = root.path("name");
			if ("".equals(nameNode.path("middle").asText())) {
				((ObjectNode) nameNode).put("middle", "M");
			}

			// 3. Create a new field in nameNode
			((ObjectNode) nameNode).put("nickname", "mkyong");

			// 4. Remove last field in nameNode
			((ObjectNode) nameNode).remove("last");

			// 5. Create a new ObjectNode and add to root
			ObjectNode positionNode = mapper.createObjectNode();
			positionNode.put("name", "Developer");
			positionNode.put("years", 10);
			((ObjectNode) root).set("position", positionNode);

			// 6. Create a new ArrayNode and add to root
			ArrayNode gamesNode = mapper.createArrayNode();

			ObjectNode game1 = mapper.createObjectNode();
			game1.put("name", "Fall Out 4");
			game1.put("price", 49.9);

			ObjectNode game2 = mapper.createObjectNode();
			game2.put("name", "Dark Soul 3");
			game2.put("price", 59.9);

			gamesNode.add(game1);
			gamesNode.add(game2);
			((ObjectNode) root).set("games", gamesNode);

			// 7. Append a new Node to ArrayNode
			ObjectNode email = mapper.createObjectNode();
			email.put("type", "email");
			email.put("ref", "abc@mkyong.com");

			JsonNode contactNode = root.path("contact");
			((ArrayNode) contactNode).add(email);

			String resultUpdate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
			System.out.println("After Update " + resultUpdate);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}