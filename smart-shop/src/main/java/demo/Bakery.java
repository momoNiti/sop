package demo;

public class Bakery {
	private int ID;
	private String name;
	private String flavor;
	private float price;
	
	public Bakery(int iD, String name, String flavor, float price) {
		super();
		ID = iD;
		this.name = name;
		this.flavor = flavor;
		this.price = price;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
