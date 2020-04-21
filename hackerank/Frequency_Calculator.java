package hackerank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Frequency_Calculator {

	public static void main(String[] args) {
		List<Integer> ls =new ArrayList<>();
		ls.add(1);
		ls.add(7);
		ls.add(4);
		ls.add(3);
		ls.add(2);
		ls.add(2);
		ls.add(2);
		ls.add(7);
		System.out.println("original list" + ls);
		HashMap<Integer, Integer> m=new HashMap<>();
		ls.stream().forEach(a -> {
			if(m.containsKey(a))
				
				m.put(a,m.get(a)+1);
			
			else m.put(a, 1);
		});
		System.out.println("hashmap values" + m.toString());

	}

}
