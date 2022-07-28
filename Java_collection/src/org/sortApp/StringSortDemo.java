package org.sortApp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringSortDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new LinkedList<>();
		s.add("naveen");
		s.add("sameer");
		s.add("vikas");
		s.add("pawan");
		s.add("pareshwar");
		
		System.out.println(s);
		Collections.sort(s);// Ascending Order
		System.out.println(s);
		Collections.reverse(s);// Descending Order
		System.out.println(s);
	}

}
