// print element which are present in Odd position in given array
public class ArrayOddposition {
	public static void main(String []args) {
		// Initialize Array
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Element which is present on Odd position in given Array");
		//Loop through the array by incrementing value of i by 2
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}
}
