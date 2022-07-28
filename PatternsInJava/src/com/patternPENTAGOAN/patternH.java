package com.patternPENTAGOAN;

public class patternH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=5;j>=i;j++) {
					System.out.print("*");
					// i+j==n-1;
					//i=1+j=3=n-1 ( 5-1)
					//i=3+j=1(3+1)=n-1 (5-1)
				}
			System.out.println();
			}
	}

}
