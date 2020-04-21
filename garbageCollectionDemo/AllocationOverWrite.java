package garbageCollectionDemo;

import java.util.Random;

public class AllocationOverWrite {
 // code to allocate memory and use visual vm and visual gc plugin to see memory allocation 
	//java mission control new project to replace visual vm
	public static void main(String[] args) throws Exception {
			int arraySize=1000000;
			GCMe [] gcmes=new GCMe[arraySize];
			int count =0;
			Random rnd=new Random ();
			
			while(true) {
				gcmes[rnd.nextInt(arraySize)]=new GCMe();
				
				
				if(count % 1000000 == 0) {
					System.out.println("allocating space");
				}
				count++;
				Main.MXBeanDemo();
				Thread.sleep(2000);
				
			}
			
	}

}
