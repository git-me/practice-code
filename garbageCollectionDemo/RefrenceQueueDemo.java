package garbageCollectionDemo;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * ReferenceQueue are used to do the cleanup mechanism, it is optional in case of phamtom refrences
 * in this code we have strong refrence whic is not gced easily, in order to clean up the refrence of person p
 * we explicitly make it null , do gc 
 *
 */
public class RefrenceQueueDemo {

	public static void main(String[] args) {
			person p =new person();
			final ReferenceQueue<person> rf=new ReferenceQueue<>();
			personcleaner pc=new personcleaner();
			//this object is created to pass the person object and refrencequeue, 
			//if this line is removed the weak refrence will not be cleaned.
			personWeakRefrence pw=new personWeakRefrence(p, pc, rf);
			//using executors to run in separate thread in background
			ExecutorService es=Executors.newSingleThreadExecutor();
			es.execute(new Runnable(){
				@Override
				public void run() {
					try {
						personWeakRefrence pr	= (personWeakRefrence) rf.remove();
						pr.clean();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			//making a strong refrence null 
			p=null;
			System.out.println("refrence of object p : " + p);
			System.gc();
			
			//wihout shoutdown the thread will keep running on backgroud and consume memory
			es.shutdown();
		
	}

}

final class person{
	
}

class personcleaner{

	public void clean() {
			System.out.println("cleaned refrences");
	}
	
}

class personWeakRefrence extends WeakReference<person>{
	personcleaner cleaner;
	
	public personWeakRefrence(person referent, personcleaner cleaner,ReferenceQueue<? super person> q) {
		super(referent, q);
			this.cleaner=cleaner;
	}
	public void clean() {
		cleaner.clean();
	}
	
}