
public class StrReverse {
	public static void main(String []args) {
		String str="Hello World";
		String rev="";
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
