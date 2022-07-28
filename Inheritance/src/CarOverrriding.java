class Vehical{
	public double calculate() {
		double speed, distance, time;
		distance=150;
		time=2.5;
		speed=distance/time;
		return speed;
	}
}

public class CarOverrriding  extends Vehical{
	public double calculate() {
		double x;
		x=super.calculate();
		System.out.println("Speed of the Vehical is : "+x+" Killometer per hour");
		return x;
	}
	public static void main(String args[]) {
		
//		Vehical v1=new Vehical();  // THis object is not work because is this not inside the main class
//		v1.calculate();
		
		CarOverrriding c=new CarOverrriding();
		c.calculate();
	}

}
