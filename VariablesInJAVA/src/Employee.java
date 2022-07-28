
public class Employee {
	{
		System.out.println("IIB-1");
	}
	public static void main(String []args) {
		Employee e1=new Employee();
		
		// IF you going to declare Instance Block inside the Main method then it work as a Static Block not as Instance Block!!

	}
	{
		System.out.println("IIB-2");
	}
}



//THis example for how we can access or change the value

//public class Employee {
//	String name;   //Declaration
//	
//	{
//		name="Shivam";   //Initilization
//		System.out.println("this.name");
//	}
//	public static void main(String []args) {
//		Employee e1=new Employee();
//
//	}
//	{
//		System.out.println("IIB-2");
//	}
//}
