package org.sortApp;

public class StudentEle implements Comparable<StudentEle>{
	String name;
	double perc;
	public StudentEle(String name, double perc) {
		this.name = name;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return this.name+" "+this.perc;
	}
	@Override
	public int compareTo(StudentEle s) {
		// TODO Auto-generated method stub
//		if(this.perc>s.perc)
//			return 1;
//		else if(this.perc==s.perc)
//		return 0;
//		else
//			return -1;
		
		// for Descending Order:-
//		if(this.perc>s.perc)
//			return -1;
//		else if(this.perc==s.perc)
//		return 0;
//		else
//			return 1;
		
//		* Ascending Order
		Double dw=this.perc;
		return dw.compareTo(s.perc);
	}
	
}
