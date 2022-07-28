
public class Player {
	void play() {
		System.out.println("Player play");
	}
}
class Cricketer extends Player{
	@Override
	void play() {
		System.out.println("Cricketer play Cricket");
	}
}

class FootballPlayer extends Player{
	@Override
	void play() {
		System.out.println("Rest people play Football");
	}
}