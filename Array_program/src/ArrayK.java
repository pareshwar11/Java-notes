
public class ArrayK {
	static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {232,15,67,33533,111,99,898};
		display(arr);
		int count=0;
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==rev(arr[i])) {
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.println("\nthe no of count plaindrome is "+count);
	}
	
	static int rev(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		return sum;
	}
}
