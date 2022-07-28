import java.util.*;

public class StrSplit {
	static List<String> splitString(String S) 
    { 
        // code here 
        String s1="";
        String s2="";
        String s3="";
        for(int i=0; i<S.length();i++){
            if(S.charAt(i)>='a' && S.charAt(i)<='z' || S.charAt(i)>='A' && S.charAt(i)<='Z'){
                s1=s1+S.charAt(i);
            }
            else if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
              s2=s2+S.charAt(i);  
            }
            else{
                s3=s3+S.charAt(i);
            }
        }
        List<String> L=new ArrayList<String>(3);
        L.add(s1);
        L.add(s2);
        L.add(s3);
        return L;
    }
}
