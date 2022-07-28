		
public class Student {
	void add() {
		int a=10;
		int b=90;
		int  sum=a+b;
		System.out.println(sum);
	}
	//In Local variable second method can't access the variable from first method.
//	void mul() {
//		int multiple=a*b;
//		System.out.println(multiple);
//	}
	public static void main(String [] args) {
		Student s1=new Student();
		s1.add();
		// In Local variable second method can't access the variable from first method. 
//		Student s2=new Student();
//		s2.mul();
	}
	
}
