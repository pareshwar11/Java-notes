class InheritanceDemo {
	public static void main(String[] args)
	{
		MountainBike mountainBike  = new MountainBike(20, 10,1);
		System.out.println("Seat Height is:"+mountainBike.seatHeight);
		System.out.println("Bike speed is:"+mountainBike.speed);
		System.out.println("Gear is:"+mountainBike.gear);
		
		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying break:"+mountainBike.speed);
	}
}
