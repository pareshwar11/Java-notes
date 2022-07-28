// WAP to Swap two variable without using third Variables;

import java.util.Scanner;

public class progS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 1st Number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int y=sc.nextInt();
		System.out.println("Before Swapping the numbers "+"x= "+x+" y= "+y);
		System.out.println("Swapping Process is ON");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x= "+x+" y= "+y);
	}

}
