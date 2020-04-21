package codechef;

import java.util.*;

class employee {
	private int empid;
	private String name;
	private int dob;

	public employee(int empid, String name, int dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
	}

	public employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", dob=" + dob + "]";
	}

}

class dobcomparator implements Comparator<employee> {

	public int compare(employee o1, employee o2) {
		int n = o1.getDob() - o2.getDob();
		if (n == 0)
			return o1.getEmpid() - o2.getEmpid();
		return n;
	}
}

class empidcomparator implements Comparator<employee> {
	public int compare(employee e1, employee e2) {
		return e1.getEmpid() - e2.getEmpid();
	}
}

class namecomparator implements Comparator<employee> {
	public int compare(employee e3, employee e4) {
		String s1 = e3.getName();
		String s2 = e4.getName();
		return s1.compareTo(s2);
	}
}

public class maincomparator {
	public static void main(final String[] args) {     // final in main argument
		employee e1[] = new employee[5];
		e1[0] = new employee();
		e1[1] = new employee();
		e1[2] = new employee();
		e1[3] = new employee();
		e1[4] = new employee();
		e1[0].setEmpid(1);
		e1[0].setName("manoj");
		e1[0].setDob(1989);
		e1[1].setEmpid(3);
		e1[1].setName("reda");
		e1[1].setDob(199);
		e1[2].setEmpid(646);
		e1[2].setName("tanoj");
		e1[2].setDob(199);
		e1[3].setEmpid(636);
		e1[3].setName("tanoj");
		e1[3].setDob(19);
		e1[4].setEmpid(6);
		e1[4].setName("tanoj");
		e1[4].setDob(109);

		System.out.println("before sorting");
		for (employee emp : e1) {
			System.out.println(emp);
		}
		System.out.println("after dob sorting");
		Arrays.sort(e1, new dobcomparator());
		for (employee employee : e1) {
			System.out.println(employee);
		}
		System.out.println("after name sorting");
		Arrays.sort(e1, new namecomparator());
		for (employee employee : e1) {
			System.out.println(employee);
		}

	}
}
