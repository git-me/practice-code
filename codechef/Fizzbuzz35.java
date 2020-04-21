package codechef;
import java.math.*;
public class Fizzbuzz35 {

	public static void main(String[] args) {
		DisplayFizz dp=new DisplayFizz() ;
		double m=Math.random();
		System.out.println("showing random" +m);
		dp.display(m);
		

	}

}
 class DisplayFizz{
	  double  display(double m){
		 boolean three=(m%3==0);
		 boolean five=(m%5==0);
		 if (three && five){
			 System.out.println("fizzbuzz");
		 }
		 if(three) System.out.println("fizz");
		 if(five) System.out.println("buzz");
		 	return m;
	 }
 }