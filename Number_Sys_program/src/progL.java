//Get Fibonacci Series

import java.util.*;
public class progL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to get Fibonacci Series ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0, n2=1, n3;
		if(n>0) {
			System.out.print(n1+" "+n2);
		}
		else
			System.out.println("Enter the Valid Number");
		for(int i=2; i<n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}

// If you want to start from 1 and till N value the Follow below Code

//int n1=1, n2=2, n3;
//if(n>0) {
//	System.out.print(n1+" "+n2);
//}
//else
//	System.out.println("Enter the Valid Number");
//for(int i=3; i<=n;i++) {
//	n3=n1+n2;
//	System.out.print(" "+n3);
//	n1=n2;
//	n2=n3;
//}