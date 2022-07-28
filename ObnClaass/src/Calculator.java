
public class Calculator {
	String name="casio";
	double price=2599.00;
	public int add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public int sub(int d, int e) {
		int minus=d-e;
		System.out.println(minus);
		return minus;
	}
	public static void main(String []args) {
		Calculator c=new Calculator();
		System.out.println("The name of the Calculator is "+c.name+" and the price is "+c.price);
		c.add(100, 50);
		c.sub(40, 60);
	}

}
