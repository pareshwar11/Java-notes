
class UpCastVehicle {
	public static void main(String []args) {
		Vehicle v=new Vehicle();
		Vehicle v1= new Car(); //Up casting
		Vehicle b=new Bike(); //Up casting
		Car c=(Car)v1; //Down casting
		System.out.println("Casted perfectly");
//		Car c1=(Car)b; //Error CCE ( ClassCastException... If we comment this statement then it runs perfectly.
	}
}
