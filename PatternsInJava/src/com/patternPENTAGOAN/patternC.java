package com.patternPENTAGOAN;

public class patternC {
public static void main(String []args) {
		
		int n=5;
		int k=65;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((char)(j+k));
			}
			k=k+n; //65+5=70 and ACII value for 70 is F
			System.out.println();
	}
	 
	}
}

//Output:-
//ABCDE
//FGHIJ
//KLMNO
//PQRST
//UVWXY
