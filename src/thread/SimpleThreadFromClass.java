//Simple thread created by implementing the Runnable interface.
package thread;

class TestThread extends Thread {
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}

public class SimpleThreadFromClass {
	
	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		new Thread(t1).start();
	}
}
