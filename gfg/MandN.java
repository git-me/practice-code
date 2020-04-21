package gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Given two positive integers M and N, after adding M and N if number of digits in M+N and N are same return N otherwise return M+N.

Input:
First line of input contains T denoting number of testcases. For each test case there will be two space seperated positive integers M and N.
Output:
If number of digits in M+N is same as N print N otherwise print M+N.
Constraints:
1 <= T <= 100
1 <= M <= 109
1 <= N <=109
Example:
Input:
2
44 22
99 12
Output:
22
111
 * 
 *
 */
public class MandN {
	public static void main(String[] args) throws Exception, IOException {
		System.out.println("enter the no");	
		BufferedReader  br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
            Integer i1=Integer.parseInt(tk.nextToken());
            Integer i2=Integer.parseInt(tk.nextToken());
           // System.out.println("number are "+i1+i2);
            
            int l=(i1+i2);
            System.out.println("number are "+l);
            int c1=numberOfDigit(i2);
            int c2=numberOfDigit((int)l);
            checkOutput(i2, l, c1, c2);
            
		
	}
	/**
	 * @param i2
	 * @param l
	 * @param c1
	 * @param c2
	 */
	private static void checkOutput(Integer i2, long l, int c1, int c2) {
		if(c1==c2) {
			System.out.println(i2);
		}
		else
		System.out.println(l);
	}
	static int numberOfDigit(int num) {
		int count =0; 
		while(num != 0)
	        {
	            num /= 10;
	            ++count;
	        }
		return count;
	}

}
