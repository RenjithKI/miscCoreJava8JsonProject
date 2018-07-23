package effectiveJava.concurrency;

import java.util.concurrent.TimeUnit;

/**effective java
 * @author Renjith
 *
 */
public class synchronizeAccessToMutabledataStopThread2 {
	static boolean stopThreadRequested;
	public static void main(String[] args) throws InterruptedException {

		Thread backgroundThread = new Thread(() -> {		
				int i =0;
				System.out.println(stopThreadRequested);
				while(!stopThreadRequested){
					i++;
					System.out.println(i);
				}
				
			}
		);
		
		backgroundThread.start();
		TimeUnit.MILLISECONDS.sleep(1);
		stopThreadRequested = true;

	}

}
