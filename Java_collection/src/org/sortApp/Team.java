package org.sortApp;

public class Team {
	String tname;
	String towner;
	public Team(String tname, String towner) {
		super();
		this.tname = tname;
		this.towner = towner;
	}
	@Override
	public String toString() {
		return this.tname;
	}
	
}
