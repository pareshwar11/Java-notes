// Enter the element to search an Array 

import java.util.Scanner;

public class ArrayD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the ");
		int []arr= {89,45,78,33,27};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the element to search");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int n=searchEle(arr, ele);
		System.out.println("Your searched element is in "+n+" index");
	}

	static int searchEle(int[] arr, int ele) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}
}
