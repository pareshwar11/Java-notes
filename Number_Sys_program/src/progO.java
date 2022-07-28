import java.util.Scanner;

public class progO {
	
//	static int findGCD(int n1, int n2) {
//		int i=1;
//		int gcd=0;
//		while(i<=n1 && i<=n2) {
//			if(n1%i==0 && n2%i==0) {
//				gcd=i;
//			}
//			i++;
//		}
//		return gcd;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WAP to check GCD of Two Number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st No.");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd No.");
		int num2=sc.nextInt();
//		int gcd=findGCD(num1, num2); 
//		System.out.println("GCD of given no is "+gcd);
		
//		Without Function code follows:
		
		int i=1;
		int gcd=0;
		while(i<=num1 && i<=num2) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
			i++;
		}
		System.out.println("GCD of given no is "+gcd);
		
	}

}
