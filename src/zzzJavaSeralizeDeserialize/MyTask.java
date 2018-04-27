package zzzJavaSeralizeDeserialize;

import java.util.concurrent.Callable;

/**
 * @author Renjith
 *https://stackoverflow.com/questions/19727109/how-to-exit-a-while-loop-after-a-certain-time
 */
class MyTask implements Runnable, Callable
{
    public void run() { 
        // add your code here
    	System.out.println("hello i am running");
    }

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		// add your code here
    	System.out.println("hello i am running");
		return null;
	}
}