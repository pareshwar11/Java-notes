//Write a program to check the given digit is Odd or Even

import java.util.Scanner;
public class progC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a program to check the given digit is Odd or Even");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Enter value is Even");
		else
			System.out.println("Enter value is Odd");
	}

}
