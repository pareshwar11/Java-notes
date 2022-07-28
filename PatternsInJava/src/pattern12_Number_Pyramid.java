
public class pattern12_Number_Pyramid {
	public static void main(String []args) {
		int n=5;
		//Outer or upper loop
		for(int i=1;i<=n;i++) {
			//inner loop 
			for(int j=1;j<=n-i;j++) {
				// for printing space
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				// for printing number
				System.out.print(i+" ");
			}
			// for going to next row or.. updating i value
			System.out.println();
		}
	}
}
