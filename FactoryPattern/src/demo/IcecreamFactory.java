package demo;

public class IcecreamFactory {
	
	public static Icecream createIcecream(String type) {
		if(type.equals("Chocolate")) {
			return new Chocolate();
		}
		else if(type.equals("Vanilla")) {
			return new Vanilla();
		}
		else {
			return null;
		}		
	}
}
