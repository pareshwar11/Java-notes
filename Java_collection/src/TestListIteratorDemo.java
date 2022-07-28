import java.util.*;

public class TestListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListIteratorDemo listIt=new ListIteratorDemo();
		listIt.setCname("mukesh");
		listIt.setCid(2001);
		listIt.setContact(1546096890);
		
		ListIteratorDemo listIt2=new ListIteratorDemo();
		listIt2.setCname("kulesh");
		listIt2.setCid(2002);
		listIt2.setContact(1224496890);
		
		ListIteratorDemo listIt3=new ListIteratorDemo();
		listIt3.setCname("kamlesh");
		listIt3.setCid(2003);
		listIt3.setContact(223096890);
		
		ListIteratorDemo listIt4=new ListIteratorDemo();
		listIt4.setCname("suresh");
		listIt4.setCid(2004);
		listIt4.setContact(664499890);
		
		System.out.println("\n---With the help of List -----\n");
		
		List<ListIteratorDemo> col=new ArrayList<ListIteratorDemo>(10);
		col.add(listIt);
		col.add(listIt2);
		col.add(listIt3);
		col.add(listIt4);
		
		System.out.println(col);
		
		// Iterator
		System.out.println("\n---Iterate using Iterator -----\n");
		Iterator<ListIteratorDemo> itr=col.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// For each
		System.out.println("\n---Iterate using For each -----\n");
		for(ListIteratorDemo var: col) {
			System.out.println(var.getCname()+" "+var.getCid()+" "+var.getContact());
		}
		
		
		// ListIterator
		
		System.out.println("\n---Iterate using ListIterator -----\n");
		System.out.println("\n---- Forward Direction-----\n");
		ListIterator<ListIteratorDemo> listItertor=col.listIterator();
		while(listItertor.hasNext()) {
			System.out.println(listItertor.next());
		}
		

		System.out.println("\n---- Reverse Direction-----\n");
		while(listItertor.hasPrevious()) {
			System.out.println(listItertor.previous());
		}
		
		
	}

}
