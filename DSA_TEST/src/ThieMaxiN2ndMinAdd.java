
public class ThieMaxiN2ndMinAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,10,8,4,15,9,6,3,17};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			if(a[i]<a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		int res=0;
		res=res+a[2]+a[a.length-2];
		System.out.println(res);
	}

}
