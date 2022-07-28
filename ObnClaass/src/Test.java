
public class Test {
	public static void main(String args[]) {
		ObnClass c1=new ObnClass();
		c1.color="blue";
		c1.price=20.99;
//		c1.type="Sketch"; Here problem is occur because I am trying to modify the final variable that is not possible for other scope
		System.out.println(c1.color+" "+c1.type);
		
		int value=50;
		int result;
		do {
			result=value+50;
			System.out.println(result);
		}while(value==0);
	}

}
