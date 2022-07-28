import java.util.Scanner;

// WAP  to print sum of each rows and each column from the Matrix ??
// For same order of Matrix means, it works if only n==m, ( 2*2, 3*3, 4*4 )

public class MatrixO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of Matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int ar[][] = new int[m][n];
		System.out.println("Enter " + m * n + " element");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println(" Enter matrix:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "(" + i + "," + j + ")");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum of each row and column");
		for (int i = 0; i < ar.length; i++) {
			int rsum = 0;
			int csum = 0;
			for (int j = 0; j < ar[0].length; j++) {
				rsum = rsum + ar[i][j];
				csum = csum + ar[j][i];
			}
			System.out.println(i + 1 + " row sum " + rsum);
			System.out.println(i + 1 + " col sum " + csum);
		}
	}
		
//	static void display(int[] arr) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(i+1+" row biggest element "+arr[i]);
//		}
//	}
}
