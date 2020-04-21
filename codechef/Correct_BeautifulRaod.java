package codechef;

import java.io.BufferedReader;
import java.io.FileReader;

public class Correct_BeautifulRaod {

	public static void main(String[] args) throws Exception {
		long prod =0 ;
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\Lenovo\\Desktop\\java\\inputBeautifulRoad.txt"));

		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];

		String lines = br.readLine();

		String[] strs = lines.trim().split("\\s+");

		for (int i = 0; i < strs.length; i++) {
			A[i] = Integer.parseInt(strs[i]);
		}
		for (int i = 0; i < strs.length; i++) {
			long s1 = 0, s2 = 0;
			for (int j = 0; j <= i; j++) {
				s1 = s1+A[j];
			}
			for (int j = i+1; j <strs.length; j++) {
				s2 = s2+A[j];
			}
			if ((s1*s2) > prod)
				prod = (s1*s2);
		}
		System.out.println(prod);

	}

}
