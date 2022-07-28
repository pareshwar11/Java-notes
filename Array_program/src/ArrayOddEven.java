// Print all the even and odd element, And print total even/odd number

public class ArrayOddEven {
	public static void main(String []args) {
		int []arr= {1,3,4,6,7,8,9,10,22,45,71};
		int countEven=0, countOdd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is even number");
				countEven++;
			}
			else {
				System.out.println(arr[i]+" is odd number");
				countOdd++;
			}
		}
		System.out.println("Count of even number is "+ countEven);
		System.out.println("Count of odd number is "+ countOdd);
	}
}
