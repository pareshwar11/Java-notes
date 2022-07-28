
import java.util.*;

public class linkedInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		----------------------------
//		for(int i=0;i<10;i++) {
//			i+=1;
//			System.out.println("Hello world");
//		}
//		-----------------------------------------
		
//		try {
//			System.out.println("Hello world");
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("!");
//		}
//		
//		------------------------
//		String message="Hello world!";
//		String newMessage=message.substring(6, 12)+message.substring(12, 6);
//		System.out.println(newMessage);
//		
//		// out runtime exception occur
		
//		try {
//			System.out.println("A");
//			badMethod();
//			System.out.println("B");
//		}catch(Exception ex) {
//			System.out.println("C");
//		}finally {
//			System.out.println("D");
//		}
//	}
//
//	private static void badMethod() {
//		// TODO Auto-generated method stub
//		throw new Error();
//	}
//		-------------------------
//		String str="hello";
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i+1));
//		}
		List<Boolean> lst=new ArrayList<>();
		lst.add(true);
		lst.add(Boolean.parseBoolean("false"));
		lst.add(Boolean.TRUE);
		System.out.println(lst.size());
		System.out.print(lst.get(1) instanceof Boolean);
	}

}
