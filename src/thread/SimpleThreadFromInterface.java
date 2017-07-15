package thread;

class TestThread1 implements Runnable {
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}

public class SimpleThreadFromInterface {

	public static void main(String[] args) {
		TestThread1 t2 = new TestThread1();
		Thread t = new Thread(t2);
		t.start();
	}

}
