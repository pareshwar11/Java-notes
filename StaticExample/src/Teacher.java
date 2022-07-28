
public class Teacher {
	
	static void changeBranch() {
		System.out.println("Teachers will help you to change your branch");
	}
	public static void main(String []args) {
//		Accessing Staic variables and methods another class by className along with dot ( e.g. Students.clgName)
		System.out.println(Students.clgName);
		Students.changeBranch(); // This method is execute from the Students class
		changeBranch(); // This method is execute from this class
	}
}
