package setCollection;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("dinga", 1110);
		Employee e2=new Employee("dingi", 2220);
		Employee e3=new Employee("machha", 3330);
		Employee e4=new Employee("machhi", 4440);
		Employee e5=new Employee("machhi", 4440);
		
		Set<Employee> s=new HashSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		System.out.println(s);
	}

}
