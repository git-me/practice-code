package codechef;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class Code1 {
	
	/*
	 * 
 7 
 7  6 
 7  6  5 
 7  6  5  4 
 7  6  5  4  3 
 7  6  5  4  3  2 
 7  6  5  4  3  2  1
	 */
	
	
	/*public static void patterngen(int n){
			int i=1;
//		System.out.println("value of n"+"\t"+n);
		while(i<=n){
					
			System.out.println("");
			for (int j=1;j<=i;j++){
				System.out.print(" "+j+" ");
//				System.out.println("value of j"+"\t"+j+"\t");
//				System.out.println("value of i"+"\t"+i);
		}
					i++;
			
		}
		}
	 *  /// this above code is for inverted pyramid similar to above.
	 */
	public static void patterngen(int n){
			int i=n;
//		System.out.println("value of n"+"\t"+n);
		while(i>0){
					
			System.out.println("");
			for (int j=n;j>=i;j--){
				System.out.print(" "+j+" ");
//				System.out.println("value of j"+"\t"+j+"\t");
//				System.out.println("value of i"+"\t"+i);
		}
					i--;
			
		}
		}
	public static void main(String[] args) throws Exception {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter pw= new PrintWriter(System.out);
//		pw.println("enter the steps");
//		System.out.println("enter the steps1");
//		String s=br.readLine();
//		int s1=Integer.parseInt(s);
		patterngen(7);
//		System.out.println("value fo s"+"\t"+s1);
	}
}