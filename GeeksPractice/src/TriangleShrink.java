
public class TriangleShrink {
	static String triDownwards(String S){
        // code here
        StringBuilder s = new StringBuilder();
        for(int i=0;i<S.length();i++){
            s.append("");
           for(int j=0; j<i; j++){
               s.append(".");
           }
        s.append( S.substring(i,S.length()));    
       }
    return s.toString();
    }
}
