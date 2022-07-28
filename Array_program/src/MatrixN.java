// WAP to print Biggest Element present each row and each column;

import java.util.*;
public class MatrixN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of Matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int ar[][]=new int[m][n];
		System.out.println("Enter "+m*n+" element");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your Entered matrix shown below:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+"("+i+","+j+")"+" ");
			}
			System.out.println();
		}
		System.out.println();
		maxElementInRow(ar.length, ar);
		maxElementInCol(ar[0].length, ar);
	}
	static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+1+" row biggest element "+arr[i]);
		}
	}
	 static void maxElementInCol(int col, int[][] arr) {
		// TODO Auto-generated method stub
		for(int j=0;j<col;j++) {
			int max=arr[0][j];
			for(int i=0;i<arr.length;i++) {
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
			}
			System.out.println(j+1+" column biggest element "+max);
		}
	}

	static void maxElementInRow(int rows, int[][] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int max=0;
		int [] result=new int[rows];
		while(i<rows) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			result[i]=max;
			max=0;
			i++;
		}
		System.out.println("Biggest element in each row and column");
		display(result);
	}

}
