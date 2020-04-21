/**
 * 
 */
package codechef;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author manoj
 * merge two arrays and order thenm in asscending order
 */
public class MergeSortedArrays {

	public static void main(String[] args) {
		String s="manoj" ;
		
		String revrsed=new StringBuilder(s).reverse().toString();
		System.out.println(revrsed);
		Integer [] arr1=new Integer[] {1,3,43,2,5,7,8};
		Integer [] arr2= new Integer []{2,4,6,9,10};
		List<Integer>ls1=Arrays.asList(arr1);
		List<Integer>ls2= Arrays.asList(arr2);
		//System.out.println(ls);
	Set<Integer> t=new TreeSet<>();
	ls1.stream().forEach(i->{
		t.add(i);
		//System.out.println(t);
	});
	
	ls2.stream().forEach(i->{
		t.add(i);
		//System.out.println(t);
	});
	 System.out.println(t);
	 //predicate of remove if to sort out only prime numbers , as they will be filtered out
	 t.removeIf(e->(e%2==0));
	 System.out.println(t);
		for(int i=0;i<(arr1.length+arr2.length)-1;i++){
			
		}
//	}
	}
}
