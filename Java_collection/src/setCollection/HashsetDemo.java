package setCollection;
import java.util.*;

// HashSet():

// HashSet is a implementation class of set Interface present since JDK 1.2v.
// it inherits all the features of set.
// HashSet is hash based collection.
// HashSet allows only one null values.
// HashSet doesn't allow duplicates.
// HashSet internally follows data-structure called Hash-Table

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add(null);
		s.add("Chinna");
		s.add("Munna");
		s.add("Dinga");
		s.add("Nibha");
		s.add("Nibbi");
		s.add(null);
		s.add("Munna");
		System.out.println(s);
	}
/*	Output:-
	
	[null, Chinna, Nibbi, Munna, Dinga, Nibha]
*/			

}
