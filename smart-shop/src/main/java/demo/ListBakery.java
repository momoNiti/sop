package demo;

import java.util.ArrayList;
import java.util.List;

public class ListBakery {
	public static List<Bakery> listOfBakery = new ArrayList<Bakery>(); 
	static {
		listOfBakery.add(new BakeryFactory().createBakery(1, "Birthday-cake", "Chocolate", 20));
		listOfBakery.add(new BakeryFactory().createBakery(2, "Christmas-cake", "Vanilla", 25));
		listOfBakery.add(new BakeryFactory().createBakery(3, "Anniversary-cake", "Lime", 30));
	}
	public static List<Bakery> addBakery(String name, String flavor, float price) {
		int counter = listOfBakery.size();
		counter += 1;
//		System.out.println(counter);
		for (Bakery i : listOfBakery) {
			if(i.getID() == counter) {
				counter += 1;
			}
		}
		listOfBakery.add(new BakeryFactory().createBakery(counter, name, flavor, price));
		return listOfBakery;
	}
	public static List<Bakery> getAllBakery(){
		return listOfBakery;
	}
	public static Bakery getBakery(int ID){
        for (Bakery i: listOfBakery) {
            if (i.getID() == ID) return i;
        }
        return null;
    }
	public static List<Bakery> deleteIdBakery(int ID) {
		for (Bakery i : listOfBakery) {
			if(i.getID() == ID) {
				listOfBakery.remove(i);
			}
		}
		return listOfBakery;
	}
}
