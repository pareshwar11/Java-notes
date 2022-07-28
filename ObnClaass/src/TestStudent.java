class Student{
	String name="Dinga";
	
	void study() {
		System.out.println(name+" is start Studying");
		sleep();
	}
	void sleep() {
		System.out.println(name+" falls for sleeping while studying");
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.study();
	}

}
