
public class StringSet1 {
	static String conRevstr(String S1, String S2) {
        // code here
         String conca=S1+S2;
        String str="";
        for(int i=conca.length()-1;i>=0;i--){
            str=str+conca.charAt(i);
        }
        return str;
    }
}
