package effectiveJava.concurrency;

import java.util.concurrent.TimeUnit;

/**effective java
 * @author Renjith
 *
 */
public class synchronizeAccessToMutabledataStopThread {
	static boolean stopThreadRequested;
	public static void main(String[] args) throws InterruptedException {

		Thread backgroundThread = new Thread(new Runnable() {
			public void run() {
				int i =0;
				while(!stopThreadRequested){
					i++;
					System.out.println(i);
				}
				}
			}
		);
		
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(2);
		stopThreadRequested = true;

	}

}
