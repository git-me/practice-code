package codechef;


class student{
	int id;
	String name;
	student(int id ,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		
		return super.toString();
	}
}

public class javaCallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s =new student(1,"manoj");
	manipulate(s);
	//System.out.println(s.id+" "+ s.name);
	String w=new String("manojString");
	String r="manoj";
	char c= 'a';
	manipulateString(r);
	manipulateString(w);
	manipulatePrimitive(c);
		//System.out.println(r+"    "+w);
	System.out.println(c);
	}

//value will change if we will directly set the vlues of student using s.id and s.name
	//but if we create a new object and then set the vslue then value i not chnged .
public static  void manipulate(student s){
	s=new student(2,"manojnew");
	//s.id=2;
	//s.name="majjjj";
	
}
public static void manipulateString(String r){
	r=new String("manojnewww");
	r="manojnewww";
}
public static void manipulatePrimitive(char c){
	c='d';
}
}
