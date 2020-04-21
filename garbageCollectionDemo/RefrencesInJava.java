package garbageCollectionDemo;

import java.lang.ref.WeakReference;

public class RefrencesInJava {

	public static void main(String[] args) {
			//strong refrence by default
			persons p=new persons();
			
			//weak refrence created and reffered to strong refrence
			WeakReference<persons> wr=new WeakReference<persons>(p);
			
			//since we are wrapping a weak refrnce in strong refrence we will 
			//get a strong refrence on get method of weak refrence
			persons p1=wr.get();
			
			System.out.println("p1  "+p1);
			System.out.println("p "+ p);
			
			//now refrencing the strong refrence but it is not gced till now.
			p=null;
			p1=null;
			persons p2=wr.get();
			//the expected o/p is that weak refrece will still give strong refrence
			//although it is null now.
			System.out.println("p2  "+p2);
			//null as o/p
			System.out.println("p "+ p);
			
			p2=null;
			System.gc();
			persons p3=wr.get();
			//the expected o/p is that weak refrence will point to null now since gc is done
			System.out.println("p3  "+p3);
			//null as o/p
			System.out.println("p "+ p);
			
			
			
	}

}

  class persons{

}