
public class ArrayG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,28,15};
		int fbig=arr[0];
		int sbig=arr[1];
		for(int i=1;i<arr.length;i++) {
			if(fbig<arr[i]) {
//				10<22
				sbig=fbig;
				fbig=arr[i];
//				
			}else if(sbig<arr[i]) {
				sbig=arr[i];
			}
		}
		System.out.println("1st Biggest element is "+ fbig);
		System.out.println("2nd Biggest element is "+ sbig);
	}

}
