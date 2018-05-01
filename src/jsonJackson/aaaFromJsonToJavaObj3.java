
package jsonJackson;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * @author Renjith
 * 4. Java Object to JSON
Convert a Staff object into a JSON formatted string.

{
   "company": Volkswagen,
   "name": "Vento",
   "price": 800000
}

 */
public class aaaFromJsonToJavaObj3 {

	public static void main(String[] args) {
		aaaFromJsonToJavaObj3 obj = new aaaFromJsonToJavaObj3();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			//JSON from file to Object
			
			Car obj = mapper.readValue(new File("C:\\ECLIPSEOXYGEN\\WS\\miscJava8Project\\src\\jsonJackson\\fileCar.json"), Car.class);

			//JSON from URL to Object
			//Staff obj2 = mapper.readValue(new URL("http://mkyong.com/api/staff.json"), Staff.class);
			//JSON from String to Object
			//Staff2 obj3 = mapper.readValue(jsonInString, Staff2.class);
			
			System.out.println(obj.toString());
			System.out.println("____________________>"+ obj.getName());
			
			
			
			
			
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
 class Car{
	String name;
	String company;
	BigDecimal Price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	
	
	
}