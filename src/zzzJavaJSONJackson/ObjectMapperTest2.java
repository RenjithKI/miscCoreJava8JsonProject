package zzzJavaJSONJackson;


import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
 * @author Renjith
 *
 */

public class ObjectMapperTest2 {
	
	public static void main(String[] args) {
	
		ObjectMapper obj = new ObjectMapper();

//	String carJson = "{ \'brand\': \'Mercedes\', \'doors\' : 5 }";
	String carJson = "shit";

	try {
	    Car car = obj.readValue(carJson, Car.class);

	    System.out.println("car brand = " + car.getBrand());
	    System.out.println("car doors = " + car.getDoors());
	} catch (IOException e) {
	    e.printStackTrace();
	}
	}
}