// WAP TO Check Palindrome Integer
import java.util.*;
public class progK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to Check Palindrome");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r, sum=0;
		int temp=n;
		while(n!=0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("It is a Palindrome");
		}else
		System.out.println("Not a Palindrome");
	} 
}
