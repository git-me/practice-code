package codechef;

/**
 * 
 * @author Polarpanda
 * https://www.codechef.com/problems/FCTRL2
 * 
 *
 */

class fact2{
	static int FactCalc(int n){ 
		int fact;
	if(n==0) return 1;
	if(n==1) return 1;
	else {
	fact=n*FactCalc(n-1);
	}
	return fact;
	}
}
public class Fact_codechef {

	public static void main(String[] args) {
		System.out.println(fact2.FactCalc(4));
		
	}

}
