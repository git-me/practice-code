package hackerank;

class LockTest {
	String thread;
	LockTest(String thread){
		this.thread=thread;
	}
	public   void  m1() {
		System.out.println("inside m1"+ Thread.currentThread().getName());
	}
	
	public  synchronized void  m2() {
		System.out.println("inside m2"+ Thread.currentThread().getName());
	}
	public static synchronized void  m3() throws InterruptedException {
		System.out.println("inside m3"+ Thread.currentThread().getName());
		Thread.sleep(3000);
	}
}
class factoryLockTest implements Runnable{
	LockTest lt;
	Thread t;
	factoryLockTest(LockTest lt){
		this.lt=lt;
		t=new Thread(this);
		t.start();
	}
	@Override
	public  synchronized  void run() {
		 try {
			LockTest.m3();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lt.m1();
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

      lt.m2();
     
	}
}




public class LockLevelDemo {

	public static void main(String[] args) {
		new factoryLockTest(new LockTest("first"));
		new factoryLockTest(new LockTest("second"));
		new factoryLockTest(new LockTest("third"));
		
		
	}

}
