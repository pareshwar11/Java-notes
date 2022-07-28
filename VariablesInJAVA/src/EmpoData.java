
public class EmpoData {
	String name;
	double salary;
	int incentive;
	
	EmpoData(String name, double salary){
	this.name=name;
	this.salary=salary;
		
	}
	EmpoData(String name, double salary, int incentive){
	this.name=name;
	this.salary=salary;
	this.incentive=incentive;
}
	EmpoData(String name){
	this.name=name;
}

	public static void main(String[] args) {
	EmpoData e1=new EmpoData("Gunda");
	EmpoData e2=new EmpoData("Divya", 25000);
	EmpoData e3=new EmpoData("Gunda", 40000, 10000);
	
	System.out.println(e1.name+" "+e1.salary+" "+e1.incentive);
	System.out.println(e2.name+" "+e2.salary+" "+e2.incentive);
	System.out.println(e3.name+" "+e3.salary+" "+e3.incentive);
}
	

}
