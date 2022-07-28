//Program To print number from n to 1

import java.util.Scanner;
public class progB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program To print number from n to 1");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}
	}

}
