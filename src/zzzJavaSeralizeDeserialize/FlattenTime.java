package zzzJavaSeralizeDeserialize;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author Renjith
 * http://www.oracle.com/technetwork/articles/java/javaserial-1536170.html
 *
 */
public class FlattenTime   {
	public static void main(String [] args)
	{
		String filename = "time.ser";
		if(args.length > 0)
		{
			filename = args[0];
		} 
		PersistentTime time = new PersistentTime();
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try
		{
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(time);
			out.writeObject(new String("jai how are you"));
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
