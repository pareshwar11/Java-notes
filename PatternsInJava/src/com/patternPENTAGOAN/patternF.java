package com.patternPENTAGOAN;

public class patternF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0||i==n-1||j==0||j==n-1||i==j||i+j==n-1) {
						System.out.print("*");
						// i+j==n-1;
						//i=1+j=3=n-1 ( 5-1)
						//i=3+j=1(3+1)=n-1 (5-1)
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
		}
	}
}

//output:-
//
//*****
//** **
//* * *
//** **
//*****
