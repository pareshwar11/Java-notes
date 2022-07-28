
public class ReciprocalString {
	static String reciprocalString(String S){
        // code here
        String str="";
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch>='a' && ch<='z'){
                str=str+(char)('a'+'z'-ch);
            }
            else if(ch>='A' && ch<='Z'){
                 str=str+(char)('A'+'Z'-ch);
            }
            else{
                 str=str+ch;
            }
        }
        return str;
    }
}
