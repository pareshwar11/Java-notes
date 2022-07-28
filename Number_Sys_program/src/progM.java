//Sum of Fibonacci Series..

import java.util.*;
public class progM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to get Sum of Fibonacci Series. ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0, n2=1, n3;
		int sum=1;
		if(n>0) {
			System.out.print(n1+" "+n2);
		}
		else
			System.out.println("Enter the Valid Number");
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			sum = sum +n3;
		}
		System.out.println("\nThe sum of Fibonacci Series = "+sum);
	}
}
