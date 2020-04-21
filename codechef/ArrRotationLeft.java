package codechef;

import java.util.ArrayList;
import java.util.List;

//@link{https://www.hackerrank.com/challenges/array-left-rotation/problem}
public class ArrRotationLeft {

	static int [] RotArr(int []a,int d){
		List<Integer> lst=new ArrayList<>();
		
		for (int i = d; i < a.length; i++) {
			lst.add(a[i]);
		}
		for (int i = 0; i < d; i++) {
			lst.add(a[i]);
		}
//		Integer [] i=lst.toArray((lst.size()));
		int[] array = lst.stream().mapToInt(i->i).toArray();
		System.out.println("in rot arr");
		for (int i = 0; i < array.length; i++) {
			System.out.print("list values"+" "+lst.get(i)+" ");
			System.out.print("  ");
			System.out.print("array"+" "+array[i]+" ");
			
		}
		return array;
		
	}
	
	public static void main(String[] args) {
		int [] a={1 ,2 ,3 ,4 ,5};
		int d=4;
		int []arr=RotArr(a, d);
	for (int i = 0; i < a.length; i++) {
		System.out.println(" ");
		System.out.print("main"+" "+arr[i]+"  ");
	}
	}
	
}
