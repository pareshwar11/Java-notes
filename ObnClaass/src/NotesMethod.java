		
public class NotesMethod {
	public int argumnt(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public void secondArgumnt() {
		System.out.println("Hello Brother");
	}
	public static void main(String []args) {
		NotesMethod n1=new NotesMethod();
		n1.argumnt(100, 100);
		n1.secondArgumnt();
	}
}
