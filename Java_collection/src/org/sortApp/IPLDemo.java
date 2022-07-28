package org.sortApp;
import java.util.*;
import java.util.Map.Entry;

public class IPLDemo {
	public static void main(String[] args) {
		Team t1=new Team("RCB", "VijayMalya");
		Team t2=new Team("CSK", "Shrini");
		Team t3=new Team("MI", "Ambani");
		Team t4=new Team("KKR", "SRK");
		
		Player p1=new Player("Virat", 18);
		Player p2=new Player("Dhoni", 7);
		Player p3=new Player("Rohit", 45);
		Player p4=new Player("Narine",150);
		Player p5=new Player("Pant", 17);
		
		Map<Player, Team> m=new TreeMap<Player, Team>();
		m.put(p1, t1);
		m.put(p2, t2);
		m.put(p3, t3);
		m.put(p4, t4);
		m.put(p5, t4);
		
		// Now we need to covert Map to Set for sorting purpose;
		Set<Map.Entry<Player, Team>> key=m.entrySet();
		for(Entry<Player, Team> entr:key) {
			String pname=entr.getKey().pname;
			String tname=entr.getValue().tname;
			System.out.println(pname+"="+tname);
		}
	}

}
