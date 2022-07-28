package setCollection;

public class Employee {
	String name;
	int empno;
	public Employee(String name, int empno) {
		this.name = name;
		this.empno = empno;
	}
	@override
	public String toString() {
		return this.name+" "+this.empno;
	}
	
	public boolean equals(Object obj) {
//		Employee e=(Employee)obj;
		return super.equals(obj);
	}
	
//	public int hashcode() {
//		return this.empno;
//	}
}
