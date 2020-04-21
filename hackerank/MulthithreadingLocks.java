package hackerank;

/**
 * code to print even odd number using alternate threads
 * 
 * @author Lenovo o/p : one: 1 two: 2 one: 3 two: 4
 */
class lockDemo implements Runnable {
	Thread t;
	String msgs;

	/**
	 * @param t
	 * @param msgs
	 * @throws InterruptedException
	 */
	public lockDemo(String msgs) throws InterruptedException {
		super();
		t = new Thread(this);
		this.msgs = msgs;
		//System.out.println("Thread name :"+t.getName());
		t.start();
		
		Thread.sleep(1000);

	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			// System.out.println("Thread :"+msgs);
			Boolean prime = (i % 2 == 0);
			synchronized (this) {
				
				if (prime && msgs.equals("two")) {
					System.out.println(Thread.currentThread().getName());

					System.out.println(msgs + ":");
					System.out.println(i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}

				}

			}
			synchronized (this) {
				if (!(prime) && msgs.equals("one")) {
					System.out.println(Thread.currentThread().getName());
					System.out.println(msgs + ":");
					System.out.println(i);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}

				}

			}

		}

	}

}

public class MulthithreadingLocks {

	public static void main(String[] args) throws InterruptedException {
		lockDemo l1 = new lockDemo("one");

		lockDemo l2 = new lockDemo("two");

	}

}
