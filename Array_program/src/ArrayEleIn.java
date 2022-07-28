// WAP to insert an element to specified Index.
// 1st we have get Index, and new element
// Create new Array with new Size (new array.length)

import java.util.Scanner;

public class ArrayEleIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Index to insert New Element");
		int in=sc.nextInt();
		System.out.println("Enter the new Element");
		int ele=sc.nextInt();
		int[] narr=insert(arr, in, ele);
		for(int i=0;i<narr.length;i++) {
			System.out.print(narr[i]+" ");
		}
	}

	static int[] insert(int[] arr, int in, int ele) {
		// TODO Auto-generated method stub
		if(in>arr.length || in<0) {
			System.out.println("\n Invalid Index");
			return arr;
		}
		int narr[]=new int[arr.length+1];
		for(int i=0;i<in;i++) {
			narr[i]=arr[i];
		}
		narr[in]=ele;
		for(int i=in;i<arr.length;i++) {
			narr[i+1]=arr[i];
		}
		return narr;
	}
}

//import java.util.Scanner;

//public class ArrayEleIn {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {10,20,30,40,50};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Index to insert New Element");
//		int in=sc.nextInt();
//		System.out.println("Enter the new Element");
//		int ele=sc.nextInt();
//		int[] narr=insert(arr, in, ele);
//		for(int i=0;i<narr.length;i++) {
//			System.out.print(narr[i]+" ");
//		}
//	}
//
//	static int[] insert(int[] arr, int in, int ele) {
//		// TODO Auto-generated method stub
//		if(in>arr.length || in<0) {
//			System.out.println("\n Invalid Index");
//			return arr;
//		}
//		int narr[]=new int[arr.length+1];
//		for(int i=0;i<in;i++) {
//			narr[i]=arr[i];
//		}
//		narr[in]=ele;
//		for(int i=in;i<arr.length;i++) {
//			narr[i+1]=arr[i];
//		}
//		return narr;
//	}
//}
