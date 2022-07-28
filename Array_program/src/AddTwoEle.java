import java.util.*;
public class AddTwoEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,2,4,5,7};
		
		boolean res=pairkey(a);
		System.out.println(res);
	}

	private static boolean pairkey(int[] a) {
		// TODO Auto-generated method stub
		int key=17;
		for(int i=0;i<a.length-1;i++) {
			{
				for(int j=1;j<a.length-1;j++) {
					if(key==a[i]+a[j]);
					{
						System.out.println(a[i]+a[j]);
						return true;
					}
//					else 
//						System.out.println("Wrong ans");
					
				}
			}
			
			
		}
		return false;
	}

}
