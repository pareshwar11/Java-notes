import java.util.Scanner;

public class MatrixP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of Matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ar[][]=new int[m][n];
		System.out.println("Enter "+m*n+" elements");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[0].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println(" entered matrix");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[0].length;j++)
			{
				System.out.print(ar[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
		System.out.println();
		sumElementInRow(ar.length, ar);
		sumElementInCol(ar[0].length, ar);
	}
//	static void display(int[] arr) {
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(i+1+" row biggest element "+arr[i]+" ");
//		}
//	}

	static void sumElementInCol(int col, int[][] arr) {
		// TODO Auto-generated method stub
		for(int j=0;j<col;j++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i][j];
			}
			System.out.println(j+1+" column sum "+sum);
		}
	}

	static void sumElementInRow(int rows, int[][] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		while(i<rows) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			System.out.println(i+1+" Row sum "+sum);
			sum=0;
			i++;
		}
	}

}
