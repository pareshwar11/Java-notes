class Dancer{
	Jacket dance() {
		Jacket j = new Jacket();
		return j;
	}
}

class Jacket{
	
}

public class TestDancer {
	public static void main(String[] args) {
		Dancer d=new Dancer();
		System.out.println( d.dance());
	}
}
