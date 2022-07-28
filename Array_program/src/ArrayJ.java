
public class ArrayJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50,60,70,90};
		int arr2[]= {70,20,45,40,50,20,70,45};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+ " ");
					break;
				}
			}
		}
	}

}
