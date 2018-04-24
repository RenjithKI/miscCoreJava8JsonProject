package jsonGson;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import com.google.gson.*;


/**https://sites.google.com/site/gson/gson-user-guide
 * http://www.oracle.com/technetwork/articles/java/javaserial-1536170.html
 * @author Renjith
 *
 */
class BagOfPrimitives {
	  private int value1 = 1;
	  private String value2 = "abc";
	  private transient int value3 = 3;
	  BagOfPrimitives() {
	    // no-args constructor
	  }
	@Override
	public String toString() {
		return "BagOfPrimitives [value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + "]";
	}
	  
	}


public class GsonBasicTest {
	
	Gson gson = new Gson();
	
		@Test
		public void Serialization() {			
			//(Serialization)
			
			gson.toJson(1);            //==> prints 1
			
			gson.toJson("abcd");      // ==> prints "abcd"
			gson.toJson(new Long(10));// ==> prints 10
			System.out.println("______________> "+ gson.toJson("abcd")  );
			int[] values = { 1 };
			gson.toJson(values);       //==> prints [1]
			
			//assertTrue(streamEmpty.);
		}
		
		@Test
		public void Deserialization() {
			//(Deserialization)
			/*int one = gson.fromJson("1", int.class);
			Integer oneI = gson.fromJson("1", Integer.class);
			Long oneL = gson.fromJson("1", Long.class);
			Boolean ffalse = gson.fromJson("false", Boolean.class);
			String str = gson.fromJson("\"abc\"", String.class);*/
			//String anotherStr2 = gson.fromJson("[\"abc\"]", String.class);
			
			String anotherStr = gson.fromJson("hai how are you", String.class);
			
			System.out.println("_______anotherStr_______> "+ anotherStr  );
		}
		
		
		@Test
		public void ObjectExamples() {
			
			//use a class of above one
			//Serialization
			BagOfPrimitives obj = new BagOfPrimitives();
			Gson gson = new Gson();
			String json = gson.toJson(obj);  
			System.out.println("_______String obj = _______> "+ obj  );
			System.out.println("_______String json = _______> "+ json  );
			//==> json is {"value1":1,"value2":"abc"}
			
			//(Deserialization)
			BagOfPrimitives obj2 = gson.fromJson(json, BagOfPrimitives.class);   
			//==> obj2 is just like obj
			System.out.println("_______obj2  = _______> "+ obj2.toString()  );
			System.out.println("_______obj2  = _______> "+ obj.equals(obj2)  );

		}
		
		@Test
		public void test4() {
			
			
			
			//assertTrue(streamEmpty.);
		}
		
		@Test
		public void test44() {
			
			
			
			//assertTrue(streamEmpty.);
		}
		
		
		@Test
		public void test5() {
			
			
			
			//assertTrue(streamEmpty.);
		}
		
		@Test
		public void test6() {
			
			
			
			//assertTrue(streamEmpty.);
		}
//
}