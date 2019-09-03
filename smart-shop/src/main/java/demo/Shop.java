package demo;

public abstract class Shop {
	protected String name;
	protected float price;
	public abstract String getFlavor();
	public abstract float getPrice();
	public abstract String getName();
}

class ChocolateBakery extends Shop{
	public ChocolateBakery(String name, float price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return "Chocolate";
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
class VanillaBakery extends Shop{
	public VanillaBakery(String name, float price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return "Vanilla";
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}