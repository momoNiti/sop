package demo;

public class ListBakery {
	public static Bakery[] listOfBakery = new Bakery[] {
		new BakeryFactory().createBakery(1, "Birthday-cake", "Chocolate", 20),
		new BakeryFactory().createBakery(2, "Christmas-cake", "Vanilla", 25),
		new BakeryFactory().createBakery(3, "Anniversary-cake", "Lime", 30)
	};
	
	public static Bakery[] getAllBakery(){
		return listOfBakery;
	}
	public static Bakery getBakery(int ID){
        for (Bakery i: listOfBakery) {
            if (i.getID() == ID) return i;
        }
        return null;
    }
}
