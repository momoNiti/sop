package demo;

public class BakeryFactory {

	public static Bakery createBakery(int iD, String name, String flavor, float price) {
		return new Bakery(iD, name, flavor, price);
	}
}
