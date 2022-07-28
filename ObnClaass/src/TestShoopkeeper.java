class Shooper{
	Product sells() {
		Product p=new Product();
		return p;
	}
}
class Product{
	
}
public class TestShoopkeeper {
	public static void main(String []args) {
		Shooper s=new Shooper();
		System.out.println( s.sells());
	}
}
