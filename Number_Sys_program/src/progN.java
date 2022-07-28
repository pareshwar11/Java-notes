// WAP to print it is Strong Number or NOT
// Strong Number: It is a sum of the factorial of each digit which equals to the same number is called Strong Number;
// Example 145!=> 1!=1
//                4!=4*3*2*1=24
//                5!=5*4*3*2*1=120
//            Now 1+24+120=145 so, that's why it is Strong Number

import java.util.Scanner;
public class progN {
	static int fact(int n) {
		int fact=1;
		while(n!=0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WAP to print it is Strong Number or Not");
		Scanner sc=new Scanner(System.in);
		// input n=145
		int n=sc.nextInt();
		int sum=0,r,temp;
		temp=n;
		while(n!=0) {
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("It is Strong Number");
		}else
			System.out.println("it is not a strong number");
		
	}

}
