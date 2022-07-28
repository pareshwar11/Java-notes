package org.sortApp;
import java.util.*;
public class TestStudentEle {
	public static void main(String[] args) {
		StudentEle s1=new StudentEle("guldu", 89.98);
		StudentEle s2=new StudentEle("dinga", 65.48);
		StudentEle s3=new StudentEle("guldi", 95.99);
		StudentEle s4=new StudentEle("dingi", 45.48);
		
		List<StudentEle> coll=new LinkedList<>();
		coll.add(s1);
		coll.add(s2);
		coll.add(s3);
		coll.add(s4);
		System.out.println(coll);
		
		Collections.sort(coll);
		System.out.println("Students are sorted based on Ascending order");
		System.out.println(coll);
	}
}
