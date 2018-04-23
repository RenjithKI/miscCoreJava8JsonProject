package zzzOracleStream;

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

/**http://www.baeldung.com/java-8-streams
 * @author Renjith
 *
 */
/**
 * @author Renjith
 *
 */

public class streamExamplesPart2 {	
	
	/*Since Java 8 the Random class provides a wide range of methods for generation streams
	 *  of primitives. 
	 * For example, the following code creates a DoubleStream, which has three elements:*/
	@Test
	public void testRandom() {
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
		//System.out.println("____________________________________-_> ");
		doubleStream.forEach( e->{System.out.println(e);}	 );
		
	}
	/*Since Java 8 the Random class provides a wide range of methods for generation streams
	 *  of primitives. 
	 * For example, the following code creates a DoubleStream, which has three elements:*/
	
	@Test
	public void teststreamOfString() {
		
		Stream<String> streamOfString =
				  Pattern.compile(", ").splitAsStream("12321232221112321233211223");
		
		String astring = "123212322211123212332112232";
		//String astring2 = astring.chars().sorted();
		String astring2 = String.valueOf(astring.chars().sorted());
		Stream<String> streamOfString2 =
				  Pattern.compile(", ").splitAsStream("12321232221112321233211223");
		
		System.out.println("____________________astring________________-_> "+ astring2);
		streamOfString.forEach( e->{System.out.println(e);}	 );
		
	}

	@Test
	public void test11() {
		
		
	}

	

}
