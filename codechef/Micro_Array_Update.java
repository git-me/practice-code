package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Micro_Array_Update {

	/*
	 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-
	 * problems/algorithm/micro-and-array-update/description/
	 * 
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = br.read();
		int size_arr=0; int threshold =0;
		while (test_case > 0) {
			System.out.println("enter values");
			String lines = br.readLine();
			String[] strgs = lines.trim().split("\\s+");
			for (int i = 0; i < strgs.length; i++) {
				if(i==0)
				 size_arr = Integer.parseInt(strgs[i]);
				else
				 threshold = Integer.parseInt(strgs[i]);
				
			}
			String arrys = br.readLine();
			String[] arrayss = arrys.trim().split("\\s+");
			int a[] = new int[size_arr];
			for (int i = 0; i < size_arr; i++) {
				a[i] = Integer.parseInt(arrayss[i]);
			}
			Arrays.sort(a);
		for (int i = 0; i <size_arr; i++) {
			if(a[i]==threshold| a[i]>threshold)
				{System.out.println("if"+0);
			 break;}
			else{
				System.out.println("valus"+(threshold-a[0]));
			}
		}
		
		test_case--;
		}
		
	}

}
