package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
	
int a;

public ThreadedGreeter(int a) {
	this.a = a;
}


	@Override
	public void run() {
		System.out.println("The thread number is " + a);
		if(a <= 50) {
			Thread t = new Thread(new ThreadedGreeter(a + 1));
			t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
