class Person{
	private String name;
	public void setName(String n) {
		name=n;
	}
	public void getName() {
		System.out.println("Name: "+ name);
	}
}

public class SportsPerson extends Person{
	private String sports;
	public void setSports(String sp) {
		sports=sp;
	}
	public void getSports() {
		System.out.println("Sports: "+ sports);
	}
	public static void main(String arg[]) {
		SportsPerson sp=new SportsPerson();
		sp.setName("Jim Johnson");
		sp.setSports("Soccer");
		sp.getName();
		sp.getSports();
	}
}
