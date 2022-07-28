

public class ArrayI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,5,15,20};
		display(arr);
		arr=sort(arr);
		System.out.println("\nAfter sorting the array\n");
		display(arr);
		System.out.println("\nMissing elements are");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=arr[i]+1;j<arr[i+1];j++) {
				System.out.println(j+ " ");
			}
		}
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
	static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
}
