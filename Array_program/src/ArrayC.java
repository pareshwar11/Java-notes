// Reversing the elements of An Array

import java.util.Scanner;

public class ArrayC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("After Entering the elements Array will be");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReversing Process is On");
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

// Below code for Taking Character as Input 

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the size of an Array");
//	int n=sc.nextInt();
//	char arr[]=new char[n];
//	System.out.println("Enter "+n+" elements");
//	for(int i=0;i<arr.length;i++) {
//		arr[i]=sc.next().charAt(0);
//	}
//	System.out.println("After Entering the elements Array will be");
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//	}
//	System.out.println("\nReversing Process is On");
//	for(int i=0;i<arr.length/2;i++) {
//		char temp=arr[i];
//		arr[i]=arr[arr.length-1-i];
//		arr[arr.length-1-i]=temp;
//	}
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//	}
//}

//Output:-
// A B C
// C B A

// For String Value
//
//public static void main(String[] args) {
// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the size of an Array");
//int n=sc.nextInt();
//String arr[]=new String[n];
//System.out.println("Enter "+n+" elements");
//for(int i=0;i<arr.length;i++) {
//	arr[i]=sc.next();
//}
//System.out.println("After Entering the elements Array will be");
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]+" ");
//}
//System.out.println("\nReversing Process is On");
//for(int i=0;i<arr.length/2;i++) {
//	String temp=arr[i];
//	arr[i]=arr[arr.length-1-i];
//	arr[arr.length-1-i]=temp;
//}
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]+" ");
//}
//}
