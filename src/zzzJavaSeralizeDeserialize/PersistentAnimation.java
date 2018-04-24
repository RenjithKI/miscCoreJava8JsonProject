package zzzJavaSeralizeDeserialize;
import java.io.Serializable;
public class PersistentAnimation implements Serializable, Runnable
{
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

