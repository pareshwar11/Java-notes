
public class NewVehicle {
	//  This is Super-Class, 
	
	//In case of Up-Casting using super-class reference we can access SUPER-CLASS / inherited variable
	// and methods but not access sub-class to variable and methods.
	
	int price;
	String regNum;
	String name;
	void start() {
		System.out.println("Vehicle start");
	}
	void move()
	{
		System.out.println("Vehicle moves");
	}

}
