
public class Students {
	static String clgName="GEC BSP";
	int age;
	String name;
	void study() {
		System.out.println("Student study");
	}
	static void changeBranch() {
		System.out.println("This is none of Business of Student, And this is class base");
	}
	public static void main(String []args) {
		//For accessing Instance variable we need to create and Object
		Students s=new Students();
		s.age=80;
		s.name="Rahul";
		System.out.println(s.age+" "+s.name);
		// For accessing Static variable and Method we don't need to create an object we can directly bcz it is Class base
		System.out.println(clgName);
		changeBranch();
	}
}
