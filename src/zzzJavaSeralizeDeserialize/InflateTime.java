package zzzJavaSeralizeDeserialize;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

/**
 * @author Renjith
 *http://www.oracle.com/technetwork/articles/java/javaserial-1536170.html
 */
public class InflateTime{
	public static void main(String [] args)
	{
		String filename = "time.ser"; // java .ser extension for serialized file 
		if(args.length > 0)
		{
			filename = args[0];
		}
		PersistentTime time = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		String st = null;
		try
		{
			/*fos = new FileOutputStream("time.ser");
			out = new ObjectOutputStream(fos);
			out.writeObject(time);
			out.close();*/
			
			fis = new FileInputStream("time.ser");
			in = new ObjectInputStream(fis);
			time = (PersistentTime)in.readObject();
			st = (String)in.readObject();// expecting more than one object
			//while deserializing
			in.close();
			/*Flattened time: Wed Apr 25 18:48:23 BST 2018

			Current time: Wed Apr 25 21:21:51 BST 2018*/
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		// print out restored time
		System.out.println("Flattened time: " + time.getTime());
		System.out.println("Flattened string: " + st);
		System.out.println();
		// print out the current time
		System.out.println("Current time: " + Calendar.getInstance().getTime());
	}
}
