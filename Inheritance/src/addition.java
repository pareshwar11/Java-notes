import java.util.Scanner;

public class addition {
	public static void main (String []args) {
		System.out.println("Enter your 1st number");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter your 2nd number");
		int b = sc.nextInt();
		System.out.println("\nChoose your arithmatic");
		System.out.println("\nAddition for press 1\nSubstraction for press 2\nMultiplication for press 3\nDivision for 4\n");
		Scanner cal=new Scanner(System.in);
		int arth=cal.nextInt();
		int sum;
		switch(arth) {
		case 1: 
			sum=a+b;
			System.out.println(sum);
			break;
		case 2: 
			sum=a-b;
			System.out.println(sum);
			break;
		case 3: 
			sum=a*b;
			System.out.println(sum);
			break;
		case 4: 
			sum=a/b;
			System.out.println(sum);
			break;
			default: System.out.println("Invalid button");
		}
	}

}
