
public class TestSecondStudnet {
	public static void main(String []args) {
		SecondStudent s=new SecondStudent();
		// set the data
		s.setPerc(56.43);
		s.setAge(24);
		
		// get the data
		System.out.println("Student age is "+s.getAge());
		System.out.println("Student percent is "+s.getPerc());
		
		System.out.println("");
		System.out.println("for perc is 26.43, and age is 14 then");
		SecondStudent s2=new SecondStudent();
		s2.setPerc(26.43);
		s2.setAge(14);
		
		// get the data
	}
}
