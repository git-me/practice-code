package hackerank;

class consumer extends Thread {
	consumer(String name) {
		super(name);
	}

	// private void Synchronized() throws InterruptedException {

	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
			Thread.sleep(4);
			System.out.println("consumer"+":"+i);
			Thread.sleep(6);
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}

class producer extends Thread {
	producer(String name) {
		super(name);
	}

	// private void Synchronized() throws InterruptedException {

	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
			System.out.println("producerr"+":"+i);
			Thread.sleep(8);
			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}

public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		consumer c = new consumer("consumer");
		producer p=new producer("producer");
		
			p.start();
			c.start();
			p.join();
			c.join();
		
		

	}

}
