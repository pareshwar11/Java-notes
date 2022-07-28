import java.util.HashSet;
import java.util.Scanner;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(countStrNum(str));
	}

	private static int countStrNum(String str) {
		// TODO Auto-generated method stub
		HashSet<Character>s=new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			s.add(str.charAt(i));
		}
		return s.size();
	}

}
