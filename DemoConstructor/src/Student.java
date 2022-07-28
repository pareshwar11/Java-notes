
public class Student {
	String name;
	int marks;
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	public static void main(String [] args) {
		Student s=new Student("Saim",430);
		System.out.println(s.name+" "+s.marks);
		Student s2=new Student("Sameer", 460);
		System.out.println(s2.name+" "+s2.marks);
	}
}
