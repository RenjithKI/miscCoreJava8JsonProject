package zzzJavaSeralizeDeserialize;
import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;
/**http://www.oracle.com/technetwork/articles/java/javaserial-1536170.html
 * @author Renjith
 *
 */


public class PersistentTime implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date time;

	public PersistentTime()
	{
		time = Calendar.getInstance().getTime();
	}
	public Date getTime()
	{
		return time;
	}
}
