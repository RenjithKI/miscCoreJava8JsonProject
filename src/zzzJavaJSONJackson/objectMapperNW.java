package zzzJavaJSONJackson;


import static org.junit.Assert.assertTrue;

import java.io.File;
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

/**https://www.baeldung.com/jackson-object-mapper-tutorial
 * @author Renjith
 *
 */

public class objectMapperNW {
	
	public static void main(String[] args) {
		
	 String srcName = "red-tulips.json";
     File srcFile = new File(srcName);
	
	ObjectMapper objectMapper = new ObjectMapper();
	CarTwo car = new CarTwo("yellow", "renault");
	//objectMapper.writeValue(srcFile, car);
//	objectMapper.writeValue
	
	
	}
}