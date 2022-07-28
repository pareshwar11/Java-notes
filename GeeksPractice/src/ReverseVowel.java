
public class ReverseVowel {
	String vowcharacter (String s)
    {
        // your code here
        String b="";
        String c="";
       for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
           {
               b+=s.charAt(i);
           }
       }
       int j=0;
       for (int i=0;i<s.length();i++){
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
               c+=b.charAt(j);
               j++;
           }else {
               c += s.charAt(i);
           }
       }
       return c;
    }
}
