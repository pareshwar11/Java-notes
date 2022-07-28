package listCollection;
//  LinkedList Example hai
import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1=new Employee("Arun", 2905);
		Employee em2=new Employee("Vivek", 2895);
		Employee em3=new Employee("Danesh", 2945);
		Employee em4=new Employee("Pawan", 2834);
		
		LinkedList<Employee> col=new LinkedList<Employee>();
		col.add(em1);
		col.add(em2);
		col.add(em3);
		col.add(em4);
		col.addLast(em3);
		col.addFirst(em4);
		
		
		System.out.println(col);
		System.out.println(col.contains(em3));
		System.out.println(col.containsAll(col));
		System.out.println(col.removeFirst());
	}

}
