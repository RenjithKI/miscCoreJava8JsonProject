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
public class ObjectMapperStudyWRite105 {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();

		CarThree car = new CarThree("avensis");
		
		try {
			objectMapper.writeValue(
				    new FileOutputStream("output-2.json"), car);
			
			objectMapper.writeValue(
				    new File("file.json"), car);
//			new FileOutputStream("data/output-2.json"), car);
			
			
			String json = objectMapper.writeValueAsString(car);
			System.out.println(json);
			
			
			System.out.println("car brand = " + car.getBrand());
		   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
