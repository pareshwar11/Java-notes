// WAP to print Biggest element in each row of an given Array;

import java.util.Scanner;

public class MatrixM {
//	static void display(int[][] arr) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=readMat();
//		display(arr);
		int []result=biggestEle(arr.length, arr);
		for(int i=0;i<result.length;i++) {
			System.out.println(i+1+" row biggest element "+result[i]+" ");
		}
	}

	static int[] biggestEle(int rows, int[][] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int max = 0;
		int result[] = new int[rows];
		while (i < rows)
		{
				for (int j = 0; j < arr[i].length; j++) {
					if (max < arr[i][j]) {
						max = arr[i][j];
					}
				}
			result[i] = max;
			max = 0;
			i++;
		}
		return result;
	}

	static int[][] readMat() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of Matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter "+m*n+" element");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
}
