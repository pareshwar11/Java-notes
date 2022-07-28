// WAP TO print Reverse a given digit

import java.util.*;
public class progJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to see the Reverse form");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r, sum=0;
		int temp=n;
		while(n!=0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(temp+" Reverse Digit of given Number will be "+sum);
	}

}
