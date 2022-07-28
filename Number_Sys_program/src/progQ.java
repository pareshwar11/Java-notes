// WAP to print it is Armstrong Number or Not.
// An ArmStrong number is an integer such that, the sum of the power of its digit is equal to the same number.
// Example:- 371: there are digit, so we have to take power of 3,
//              : 3^3+7^3+1^3 
//              : 27+343+1
//              : 371


import java.util.*;
public class progQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=isArmstrong(n);
		if(res) {
			System.out.println(n+" is a ArmStrong Number");
		}
		else
			System.out.println(n+" is not a ArmStrong Number");
	}

	 static boolean isArmstrong(int x) {
		// TODO Auto-generated method stub
//		First we have to calculate the number of digit present 
		 int t=x;
		int nd=countDigit(x);
		System.out.println(nd);
		int r, sum=0;
		while(x!=0) {
			r=x%10;
			sum=sum+pow(r, nd);
			x=x/10;
		}
		if(t==sum)
		return true;
		else
			return false;
	}
	static int pow(int r, int p) {
		// TODO Auto-generated method stub
		int pw=1;
		while(p>0) {
			pw=pw*r;
			p--;
		}
		return pw;
	}

	static int countDigit(int n) {
		// TODO Auto-generated method stub
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}

}
