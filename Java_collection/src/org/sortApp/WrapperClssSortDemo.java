package org.sortApp;

public class WrapperClssSortDemo {
	public static void main(String[]args) {
		Integer i1=new Integer(23);
		Integer i2=new Integer(50);
		System.out.println(i1.compareTo(i2)); // -1 bcoz 1 value which is minimum and compare with 2nd value which is max 	
	
		Double d1=(60.87); // Internally auto-box
		Double d2=(35.56); // Internally auto-box
		System.out.println(d1.compareTo(d2)); // 1 for Large
		
		Double d3=(60.87); // Internally auto-box
		Double d4=(60.87); // Internally auto-box
		System.out.println(d3.compareTo(d4)); // 0 for Equal
	
	}
}
