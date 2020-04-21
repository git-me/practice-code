package codechef;

public class TwoDArray {

	public static void main(String[] args) {
	int[][]a= {{0,1,2},{3,4,5,6}};
	System.out.println(a[0].length);
	System.out.println(a[1].getClass().isArray());
		System.out.println(a[0][1]);
		checkreturn();
		String s =checkreturn();
		System.out.println("s vlue in main "+ s);
		System.out.println("s"+2+3+4);
		System.out.println("s"+2+3*3);

	}
	public static String checkreturn() {
		int[][]a= {{0,1,2},{3,4,5,6}};
		try {
		System.out.println(a[2].length);
		return "tryblock";
		}
		catch(Exception e) {
			return "catch block";
		}
		//finally block does not complete normally warning
		finally {
			//System.out.println("finally");
			return "finally retun statemen overiding catch return block  and finally return block " ;
			 
		}
	
		//two D arrays in this case is  described as a[0][0] a[0][1]....a[1][0] a[1][1]...a[1][3]
	}

}
