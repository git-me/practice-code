package codechef;



	import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


	public class BinaryConvert {
	    public static void main(String[] args) throws IOException {
	        
	        long n = 3;
	      

	        long out = FindBigNum(n);
	       System.out.println(out);
	    }

	    static long FindBigNum(long n) {
	        //String temp;
	       String convertedToBinary = Integer.toBinaryString(1);
	        for (int i=2;i<=n;i++){
	         String temp =Integer.toBinaryString(i);
	         convertedToBinary=convertedToBinary.concat(temp);
	        }
	       // System.out.println(convertedToBinary.length());
	        
	       // int u=Integer.parseInt(convertedToBinary);
	       // System.out.println("u"+ u+"  ");
	         String temp2;
	         //int u=(int)n;
	         char ch[]=new char[convertedToBinary.length()];
	         for(int j=0;j<n;j++){
	             ch[j]=convertedToBinary.charAt(j);
	         } 
	         
	         temp2=new String(ch);
	         System.out.println(Integer.parseInt(temp2,2));
	         Long finalVlaue=Long.valueOf((Integer.parseInt(temp2,2))%10000000007L);
	         //long finalVlaue=i;
	         return  finalVlaue;
	         
	    }
	}