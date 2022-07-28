
public class ListIteratorDemo {
	private String Cname;
	private int Cid;
	private long Contact;
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	@Override
	public String toString() {
		return this.getCname() + " " + this.getCid() + " "+ this.getContact()+" ";
	}
	

}
