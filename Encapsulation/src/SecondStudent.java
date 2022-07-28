
public class SecondStudent {
	private double perc;
	private int age;
	
	// setter [write/initilize]
	
	public void setPerc(double p) {
		if(p>35 && p<=100) {
			this.perc=p;
		}else {
			System.out.println("Your percent criteria is not eligible");
		}
	}
	
	public void setAge(int a) {
		if(a>15 && a<=50) {
			this.age=a;
		}else
			System.out.println("age criteria doesn't match");
	}
	
	// getter [read/featch] the data
	
	public double getPerc() {
		return this.perc;
	}
	// getter [read/featch] the data
	
	public int getAge() {
		return this.age;
	}
	
}
