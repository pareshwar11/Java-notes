//import java.util.*;
class Cow{
	Milk gives() {
		Milk m1=new Milk();
		return m1;
	}
}
class Milk{
	
}
public class TestCow {
	public static void main(String []args) {
		Cow c1=new Cow();
		System.out.println(c1.gives());
	}

}
