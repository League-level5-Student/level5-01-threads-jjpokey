package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
Thread[] ta;
ConcurrentLinkedQueue<Task> taskQueue;
	public ThreadPool(int totalT) {
		ta = new Thread[totalT];
		
		taskQueue = new ConcurrentLinkedQueue<Task>();
		
		for(int j = 0; j < ta.length; j++) {
			ta[j] = new Thread(new Worker(taskQueue));
		}
	}

	public void addTask(Task t) {
		taskQueue.add(t);
	}

	public void start() {
		
		for(int j = 0; j < ta.length; j++) {
			ta[j].start();
		}
		for(int a = 0; a < ta.length; a++) {
			for(int j = 0; j < ta.length; j++) {
				try {
					ta[j].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
