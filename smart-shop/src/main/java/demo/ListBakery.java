package demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListBakery implements Serializable{
	public static List<Bakery> listOfBakery = new ArrayList<Bakery>();
	static {
		try {
			File file = new File("myObjects.txt");
			if(file.exists()) {
				listOfBakery = IO.ReadObject();
				System.out.println("Have file");
			}
			else {
				listOfBakery.add(new BakeryFactory().createBakery(1, "Birthday-cake", "Chocolate", 20));
				listOfBakery.add(new BakeryFactory().createBakery(2, "Christmas-cake", "Vanilla", 25));
				listOfBakery.add(new BakeryFactory().createBakery(3, "Anniversary-cake", "Lime", 30));
				IO.SaveObject(listOfBakery);
				System.out.println("Initial file");
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
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
		IO.SaveObject(listOfBakery);
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
				break;
			}
		}
		IO.SaveObject(listOfBakery);
		return listOfBakery;
	}
	@Override
	public String toString() {
		return "This is to string method... Test...";
	}
	
}
