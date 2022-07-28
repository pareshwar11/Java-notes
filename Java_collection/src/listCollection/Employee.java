package listCollection;

public class Employee {
	String empname;
	int salary;
	public Employee(String empname, int salary) {
		super();
		this.empname = empname;
		this.salary = salary;
	}
	public String toString() {
		return "name: "+this.empname+" , Salary: "+this.salary;
	}

}
