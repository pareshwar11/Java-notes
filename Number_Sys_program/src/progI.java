// Enter the Number for getting table of that Number

import java.util.*;
public class progI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number for getting table of that Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
