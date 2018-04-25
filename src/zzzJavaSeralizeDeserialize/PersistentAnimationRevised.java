package zzzJavaSeralizeDeserialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Renjith
 *http://www.oracle.com/technetwork/articles/java/javaserial-1536170.html
 */
public class PersistentAnimationRevised implements Serializable, Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient private Thread animator;
	private int animationSpeed;
	public PersistentAnimationRevised(int animationSpeed)
	{
		this.animationSpeed = animationSpeed;
		startAnimation(); 
	}
	public void run()
	{
		while(true)
		{
			// do animation here
		}
	} 
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.defaultWriteObject(); 
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		// our "pseudo-constructor"
		in.defaultReadObject();
		// now we are a "live" object again, so let's run rebuild and start
		startAnimation();

	}
	private void startAnimation()
	{
		animator = new Thread(this);
		animator.start();
	}
}
