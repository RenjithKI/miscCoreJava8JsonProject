package zzzJavaSeralizeDeserialize;
import java.io.Serializable;

/**
 * @author Renjith
 *http://www.oracle.com/technetwork/articles/java/javaserial-1536170.html
 */
public class PersistentAnimation implements Serializable, Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient private Thread animator;
	private int animationSpeed;
	public PersistentAnimation(int animationSpeed)
	{
		this.animationSpeed = animationSpeed;
		animator = new Thread(this);
		animator.start();
	}

	@Override
	public void run() {
		while(true)
		{
			// do animation here
		}

	} 


}

