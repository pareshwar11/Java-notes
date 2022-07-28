package com.patternPENTAGOAN;

public class patternI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				// j=n-i, it is not mean that coloum start from 5, Coloum always moves left to right
				
				System.out.print(" ");
				//initially n=5, so j=5-0 = 5;
				// for j=5 print Space  and Decrement j--
				// for j=4 print Space  and Decrement j--
				// for j=3 print Space  and Decrement j--
				// for j=2 print Space  and Decrement j--
				// for j=1 condition false so goes to line of code and print the *
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
				// if i=0 means 1 *
				// if i=1 means 2 *
				// if i=2 means 3 *
				// if i=3 means 4 *
				// if i=4 means 5 *
			}
			System.out.println();
			// for goes to the next line
		}

	}

}
