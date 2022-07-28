
public class UpperCaseStr {
	public String transform(String s)
    {
        // code here
        String[] a = s.split(" ");
         String t = "";
        for(int i = 0 ; i < a.length ; i++){
          t += a[i].substring(0,1).toUpperCase()+a[i].substring(1);
          if(i < a.length - 1)
           t+= " ";
        }
      return t;
    }

}

