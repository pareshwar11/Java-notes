
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int i=1;i<=n;i++)
		 {
		  for(int j=1;j<=n;j++)
		    {

		   if(i==1 || j==1 || i==n|| j==n || i==j && j!=(n/2)+1 || j==((n+1)-i) && j!=n/2+1)
		    {
		         System.out.print(" *");
		     }
		     else
		    	 System.out.print("  ");
		   }
		  System.out.print("\n");
		 }

	}

}
