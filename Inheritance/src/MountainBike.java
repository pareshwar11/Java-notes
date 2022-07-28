
class MountainBike extends Bicycle {
	public int seatHeight;
	public MountainBike(int startHeight, int startSpeed, int startGear)
	{
		super(startSpeed, startGear);
		this.seatHeight=startHeight;
	}
	public void seatHeight(int newValue)
	{
		gear=newValue;
	}
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void seedUp(int increment)
	{
		speed+=increment;
	}

}
