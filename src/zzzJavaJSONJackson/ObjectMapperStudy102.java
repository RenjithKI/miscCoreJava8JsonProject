package zzzJavaJSONJackson;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
 * */
public class ObjectMapperStudy102 {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("data/car.json");

		
		try {
			Car car = objectMapper.readValue(file, Car.class);
			System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
