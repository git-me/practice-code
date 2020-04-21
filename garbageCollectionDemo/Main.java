package garbageCollectionDemo;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class Main {

	public static void MXBeanDemo() {
		List<GarbageCollectorMXBean> list =ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean bean:list) {
			System.out.println("bean name"+ bean.getName());
			System.out.println("No of collections"+ bean.getCollectionCount());
			System.out.println("collection time"+ bean.getCollectionTime());
			System.out.println("Memory pool names");
			for(String beans: bean.getMemoryPoolNames()) {
				System.out.println("\t"+beans);
			}
		}

	}

}
