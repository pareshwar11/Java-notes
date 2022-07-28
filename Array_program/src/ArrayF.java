// WAP to return Small and Big element in the existing Array ??

import java.util.Scanner;

public class ArrayF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,45,9,33,97};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReturning the small and big element present in An Array");
		Scanner sc=new Scanner(System.in);
		arr=sort(arr);
		System.out.println(arr[0]+" ---> Smallest");
		System.out.println(arr[arr.length-1]+" ---> Biggest");
	}

	static int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
