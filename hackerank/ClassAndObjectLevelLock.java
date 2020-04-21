package hackerank;

public class ClassAndObjectLevelLock {

	public static void main(String[] args) {

		MyClass mObj = new MyClass();
		Thread t1 = new Thread(new ThreadMultiple(mObj));
		Thread t2 = new Thread(new ThreadMultiple(mObj));
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();

	}

}

class ThreadMultiple implements Runnable {

	MyClass p;

	ThreadMultiple(MyClass p) {
		this.p = p;
	}

	@Override
	public void run() {
		// p.m3();

		if (Thread.currentThread().getName().equals("t1")) {
			MyClass.m1();
		}

		if (Thread.currentThread().getName().equals("t2")) {
			p.m2();
		}

	}

}

class MyClass {

	public static synchronized void m1() {
		System.out.println("m1 called: " + Thread.currentThread().getName());
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sleep over m1 called: " + Thread.currentThread().getName());
	}

	public synchronized void m2() {
		System.out.println("m2 called: " + Thread.currentThread().getName());
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Sleep over m1 called: " + Thread.currentThread().getName());
	}

	public void m3() {
		System.out.println("m3 called: " + Thread.currentThread().getName());

	}
}
