package zzzJavaSeralizeDeserialize;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
public class MyTaskexecutorsnewSingleThreadExecutor2 {

	public static <T> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.invokeAll((Collection<? extends Callable<T>>) Arrays.asList(new MyTask()), 10, TimeUnit.SECONDS); // Timeout of 10 seconds.
		executor.shutdown();

	}

}
