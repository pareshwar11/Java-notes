//is not a prime number

import java.util.Scanner;
public class progF {
	public static void main(String []args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n/2;
		int flag=0;
		if(n==0 || n==1) {
			System.out.println(n+" is not a prime number");
		}
		else
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					flag=1;
//					Flag=1, define that if N is divisible by one time then, no need to go for next round, just print and Break the loop.
					System.out.println(n+" is not a prime number");
					break;
				}
			}
		if(flag==0) {
			System.out.println(n+" is a prime number");
		}
	}
}
