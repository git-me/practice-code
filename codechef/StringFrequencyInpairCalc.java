/**
 * 
 */
package codechef;

import java.util.HashMap;

/**
 * @author manoj
 *
 */
public class StringFrequencyInpairCalc {

	/**
	 * @param args
	 * this code checks the pair occurences of the string given like ab,bc,cd,so on  
	 */
	public static void main(String[] args) {
		String str =  "abcdefgabc";
		String[] s=new String [str.length()];
		HashMap<String, Integer> hm=new HashMap<>();
		
		for(int i=0;i<str.length()-1;i++){
			s[i]=str.substring(i, i+2);
			System.out.println(s[i]+"  ");
		}

		for(int i=0;i<s.length;i++){
			if(hm.containsKey(s[i])){
				hm.put(s[i],hm.get(s[i])+1 );
			}
			else{
		hm.put(s[i], 1); 
			}
		}
	System.out.println(hm);
	}
}
