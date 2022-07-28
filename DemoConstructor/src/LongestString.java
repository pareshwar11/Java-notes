// THis Code is not working properly so, Do not copy 
import java.util.Scanner;

 public class LongestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            String[] names = new String[n];

            for (int j = 0; j < n; j++) names[j] = sc.next();

            String strA=longest(names,n);
            System.out.println(strA);
//            System.out.println(((LongestString) obj).longest(names, n));
        }
    }

    static String longest(String names[], int n) {
    	String longname = names[0];
    	for (int i = 1; i < n; i++) {
    		if (names[i].length() > longname.length()) {
    			longname = names[i];
    		}
    	}
    	return longname;
    }
    
}
// } Driver Code Ends

  

