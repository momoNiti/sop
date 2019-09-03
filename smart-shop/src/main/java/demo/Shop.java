package demo;

public abstract class Shop {
	public abstract String getFlavor();
	public abstract float getPrice();
	public abstract String getName();
}

class ChocolateBakery extends Shop{
	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return "Chocolate flavor";
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return (float) 25.00;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Chocolate cake";
	}
	
}
class VanillaBakery extends Shop{
	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return "Vanilla flavor";
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return (float) 30.00;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Vanilla cake";
	}
	
}