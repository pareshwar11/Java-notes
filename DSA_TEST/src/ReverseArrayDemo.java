
public class ReverseArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,3,4,5,8};
		
		for(int i=0;i<=a.length/2;i++) {
			int temp=a[i];
			 a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println("After reversing the array");
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
