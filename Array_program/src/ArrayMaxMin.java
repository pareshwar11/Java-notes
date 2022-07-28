
public class ArrayMaxMin {
	public static void main(String[]args) {
		int []arr= {12, 46,9,2088, 6794, 3};
		
		// Start by assigning the first array element to both the variables
		int initialMax=arr[0];
		int initialMin=arr[0];
		
		//Start with next index ( i.e. i=1 )
		for(int i=1;i<arr.length;i++) {
			if(initialMax<arr[i]) {
				initialMax=arr[i];
			}
			else if(initialMin>arr[i]){
				initialMin=arr[i];
			}
		}
		System.out.println("Largest Number:"+ initialMax +", Smallest number: "+initialMin);
	}
}
