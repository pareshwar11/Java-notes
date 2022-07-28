
public class SameStringYES {
	public static void main(String []args) {

	        // your code here  
		String s="geeks";
	     char ch=s.charAt(0);
	     System.out.println(ch);
	        for(int i=0;i<s.length();i++)
	        {
	            if(!(ch==s.charAt(i)))
	            {
	            System.out.println("NO");
	            }
	        }
	        System.out.println("YES");
	}

}
