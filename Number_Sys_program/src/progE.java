// Through this code you can see the Factorial value till N value
// If  N=5
// OUTPUT
//1---> 1
//2---> 2
//3---> 6
//4---> 24
//5---> 120

import java.util.Scanner;
public class progE {
	static int fact(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range of Factorial number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+"---> "+fact(i));
			// for i=1,, fact(1)---- after call the method n=1, fact=1---- 1*1=1
			// for i=2,, fact(2)---- after call the method n=2, fact=1---- 1*2=2 and n-- that is 1, and 2*1=2.
			// for i=3,, fact(3)---- after call the method n=3, fact=1---- 1*3=3 and n-- (3--) that is 2, and 3*2=6 and n--(2--) that is 1, and 6*1=6
			// for i=4
		}
	}

}
