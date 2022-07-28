// WAP to print Strong Number from 1 to n

import java.util.Scanner;

public class progP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WAP to print Strong Number from 1 to n ");
		Scanner sc=new Scanner(System.in);
		// input n=
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num=i;
			// suppose num=1
			//
			int r, temp, sum=0;
			temp=i;
//			temp is storing the all count number, because N is storing the limit of Count 
			while(num!=0) {
				r=num%10;
				sum=sum+strongNum(r);
				num=num/10;
			}
			if(temp==sum)
			{
				System.out.println(sum);
			}
		}
	}
	static int strongNum(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		while(n!=0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
