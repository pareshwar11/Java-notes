// WAP to Swap two variable with using third Variables;

import java.util.Scanner;

public class progR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st Number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int n2=sc.nextInt();
		int n3;
		System.out.println("Before Swap values are "+n1+" "+n2);
		n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("Before Swap values are "+n1+" "+n2);
	}
}
//  For String Data Types
//
//  public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	System.out.println("Enter 1st Letter");
//	Scanner sc=new Scanner(System.in);
//	String n1=sc.next();
//	System.out.println("Enter 2nd Letter");
//	String n2=sc.next();
//	String n3;
//	System.out.println("Before Swap values are "+n1+" "+n2);
//	n3=n1;
//	n1=n2;
//	n2=n3;
//	System.out.println("After Swap values are "+n1+" "+n2);
//}
