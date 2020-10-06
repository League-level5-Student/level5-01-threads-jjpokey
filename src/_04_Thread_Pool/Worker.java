package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue taskQueue) {
		this.taskQueue = taskQueue;
		taskQueue = new ConcurrentLinkedQueue<Task>();
	}
	@Override
	public void run() {
while(taskQueue != null) {
	taskQueue.remove().perform();
}
		
	}


}
