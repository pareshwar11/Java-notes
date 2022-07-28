public class RemoveSpace
{
   
    String modify(String S)
    {
        // your code here
        char chars[]=S.toCharArray();
        String Str1="";
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                Str1=Str1+chars[i];
            }
        }
        return Str1;
    }
    public static void main(String[] args) {
    	String S="Java is a High Level Pro Lang";
    	char chars[]=S.toCharArray();
        String Str1="";
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                Str1=Str1+chars[i];
            }
        }
        System.out.println(Str1);
    }
}