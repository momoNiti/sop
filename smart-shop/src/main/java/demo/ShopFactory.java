package demo;

public class ShopFactory {

	public static Shop getBakery(String flavor) {
		if (flavor.equals("chocolate")) {
			return new ChocolateBakery();
		}
		else if (flavor.equals("vanilla")) {
			return new VanillaBakery();
		}
		else {
			return null;
		}
	}
}
