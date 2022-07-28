
public class CarThis {
	CarThis(String name){
		this(2706);
		System.out.println("I am String Constructor");
	}
	CarThis(int model){
		this("KB784454993", 47861124);
		System.out.println("I am int Constructor");
	}
	CarThis(String clientID, long vehicalId){
		//Super() Initilization  and return this default object class constructor
		System.out.println("I am String and long Constructor");
	}
}

