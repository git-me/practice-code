package codechef;


class a{
	void show(int i) {
		System.out.println("a");
	}
}
//here class b is while extending class a is also inheriting the method of a, and in main method
//when show method is called then best suitable match is checked.
class b extends a {
	void show(Integer i) {
		System.out.println("b");
	}
}


public class Testaagreya {

	public static void main(String[] args) {
		a a1=new b();
		a1.show(10);
	}
}
