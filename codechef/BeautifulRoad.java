package codechef;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
/*
 *  	https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/beautiful-journey-1/description/
 *  
 */

public class BeautifulRoad {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedReader br = new BufferedReader(
                 new FileReader("C:\\Users\\Lenovo\\Desktop\\java\\inputBeautifulRoad.txt" ));

		System.out.println("enter the checkpoints");
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		System.out.println("enter the arrays vlue");
		String  lines = br.readLine();    

	    String[] strs = lines.trim().split("\\s+");

		for (int i = 0; i < strs.length; i++) {
			A[i] = Integer.parseInt(strs[i]);
		}
		System.out.println("Array:");
		for (int i = 0; i < A.length; i++) {
			System.out.println("array entered" + A[i]);
		}
		int sorted_array[] = sort_arr(A);
		for (int i = 0; i < sorted_array.length; i++) {
			System.out.println("sorted arr" + sorted_array[i]);
		}
		int sum_a[] = sum_arr(sorted_array);
		for (int i = 0; i < sum_a.length; i++) {
			System.out.println("sum returned"+sum_a[i]);
		}
	
			int  b=sum_a[0]*sum_a[1];
			;
			System.out.println("final o/p:"+" "+b);
		
	}

	private static int[] sum_arr(int[] sorted_array) {
		int sum1 = 0;
		int half_length = (sorted_array.length) / 2;
		for (int i = 0; i <= half_length; i++) {
			sum1 += sorted_array[i];
		}
		int temp = (half_length + 1);
		int sum2 = 0;
		for (int i = temp; i < sorted_array.length; i++) {
			sum2 += sorted_array[i];
		}
		int arr_sum_final[] = new int[2];
		arr_sum_final[0] = sum1;
		arr_sum_final[1] = sum2;
		return arr_sum_final;
	}

	private static int[] sort_arr(int[] a) {
		Arrays.sort(a);
		return a;
	}

}
