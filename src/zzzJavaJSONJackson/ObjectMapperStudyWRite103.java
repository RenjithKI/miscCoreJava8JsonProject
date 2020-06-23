package zzzJavaJSONJackson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
 * */
public class ObjectMapperStudyWRite103 {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		Car car = new Car();
		car.brand = "BMW";
		car.doors = 4;

		

		
		try {
			objectMapper.writeValue(
				    new FileOutputStream("output-2.json"), car);
//			new FileOutputStream("data/output-2.json"), car);
			System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
