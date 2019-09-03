package demo;

public class ShopFactory {

	public static Shop createChocolateBakery(String name, float price) {
		return new ChocolateBakery(name, price);
	}
	public static Shop createVanillaBakery(String name, float price) {
		return new VanillaBakery(name, price);
	}
}
