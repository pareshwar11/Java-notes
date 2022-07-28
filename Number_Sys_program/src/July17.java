import java.util.Scanner;

public class July17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array a:");
		int aSize=sc.nextInt();
		int []a=new int[aSize];
		System.out.println("Enter the size of array b:");
		int bSize=sc.nextInt();
		int []b=new int[bSize];
		int i,j;
		int k=0;
		
		int intersection[]=new int[aSize+bSize];
		int union[]=new int[aSize+bSize];
		
		System.out.println("Enter the element of array A");
		for(i=0;i<=aSize-1;i++) {
			a[i]=sc.nextInt();
			for(j=0;j<=aSize-1;j++) {
				
			}
		}
//		for(i=0;i<=aSize-1;i++) {
//			System.out.print(a[i]+" ");
//		}
		
		System.out.println("Enter the element of array b");
		for(i=0;i<=bSize-1;i++) {
			b[i]=sc.nextInt();
		}
//		for(i=0;i<=bSize-1;i++) {
//			System.out.print(b[i]+" ");
//		}
		for(i=0;i<=aSize-1;i++) {
			for(j=0;j<=bSize-1;j++) {
				if(a[i]==b[j]) {
					intersection[k]=a[i];
					k++;
				}
			}
		}
		System.out.println("Intersection values of two array is ");
		for(i=0;i<=k-1;i++) {
			System.out.print(intersection[i]+" ");
		}
	}
}
