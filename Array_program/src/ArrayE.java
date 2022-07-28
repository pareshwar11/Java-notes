// WAP to delete an element of a specified index in the existing Array ??

import java.util.Scanner;
public class ArrayE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {89,45,78,33,27};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the Index of Element to delete");
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int narr[]=delete(arr, in);
		for(int i=0;i<narr.length;i++) {
			System.out.println(i+" ---> "+narr[i]);
		}
	}

	static int[] delete(int[] arr, int in) {
		// TODO Auto-generated method stub
		if(in<0 || in>arr.length) {
			System.out.println("Invalid index");
			return arr;
		}
		int narr[]=new int[arr.length-1];
		for(int i=0;i<in;i++) {
			narr[i]=arr[i];
		}
		for(int i=in;i<arr.length-1;i++) {
			narr[i]=arr[i+1];
		}
		return narr;
	}

}
