
public class TestNewVehicle extends NewVehicle{
	// THis is sub-class
	
	//In case of Up-Casting using super-class reference we can access SUPER-CLASS / inherited variable
	// and methods but not access sub-class to variable and methods.
	
	int nog;
	void playMusic() {
		System.out.println("Music is palying");
	}
	public static void main(String []args) {
//		TestNewVehicle v=new TestNewVehicle();  This is not a up-casting
//		v.nog=45;
		
		NewVehicle v=new TestNewVehicle(); 
//		Up-Casting is here
		v.price=1000000;
		v.regNum="KA05NB3243";
		v.name="Venue";
		v.move();
		v.start();
		
//		v.nog=34;   // THis is going to access because up-casting is occur in super-class.
//		v.playMusic();
	}

}
