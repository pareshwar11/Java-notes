import java.util.*;
public class ExtrctInteger {
	ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
         ArrayList<String> result = new ArrayList<>();
        int n = s.length();
        String temp = "";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                temp="";
                while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    temp+=s.charAt(i);
                    i++;
                }
                result.add(temp);
            }
        }
        if(result.isEmpty())
            {
                result.add("No Integers");
                return result;
            }
        else
            return result;
    }
}
