
public class CountTyperCharc {
	int[] count (String s)
    {
        // your code here 
        int arr[] = new int[4];
        for(int i = 0; i< s.length(); i++) {
        if(Character.isUpperCase(s.charAt(i))) {
         arr[0]++;
        } else if(Character.isLowerCase(s.charAt(i))) {
         arr[1]++;
        } else if(Character.isDigit(s.charAt(i))) {
         arr[2]++;
        } else {
         arr[3]++; } 
        } 
        return arr;
    }
}
