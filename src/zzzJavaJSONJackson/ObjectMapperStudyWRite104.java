package zzzJavaJSONJackson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
 * */
public class ObjectMapperStudyWRite104 {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat22 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		
		objectMapper.setDateFormat(dateFormat22);

		CarThree car = new CarThree("avensis");
		
		try {
			
			
			
			String json = objectMapper.writeValueAsString(car);
			System.out.println(json);
			
			
			System.out.println("car brand = " + car.getBrand());
		   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
