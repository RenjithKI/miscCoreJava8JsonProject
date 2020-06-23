package zzzJavaJSONJackson;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
 * */
public class ObjectMapperStudy100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ObjectMapper objectMapper = new ObjectMapper();

//			String carJson = "{ \'brand\': \'Mercedes\', \'doors\' : 5 }";
		 String carJson =  "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
			String carJson2 = "shit";

			try {
			    Car car = objectMapper.readValue(carJson, Car.class);

			    System.out.println("car brand = " + car.getBrand());
			    System.out.println("car doors = " + car.getDoors());
			} catch (IOException e) {
			    e.printStackTrace();
			}
			

	}

}
