
public class Horse {
	String name;
	void run() {
		System.out.println(this);
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Horse h1=new Horse();
		System.out.println(h1);
		h1.name="Brego";
		
		Horse h2=new Horse();
		h2.name="Chetak";
		
		h1.run();
		
		h2.run();
	}
}
