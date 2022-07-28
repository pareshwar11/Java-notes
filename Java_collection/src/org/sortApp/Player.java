package org.sortApp;

public class Player implements Comparable<Player> {
	String pname;
	int jno;
	public Player(String pname, int jno) {
		super();
		this.pname = pname;
		this.jno = jno;
	}
	@Override
	public String toString() {
		return this.pname+" ";
	}
	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return this.pname.compareToIgnoreCase(o.pname); // For Ascending Order
		// return this.pname.compareToIgnoreCase(o.pname)*-1;  ** For Descending Order
	}
}
