package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class IO {
	public static void SaveObject(List<Bakery> list) {
		
		try {
			FileOutputStream fos = new FileOutputStream("myObjects.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	public static List<Bakery> ReadObject() {
		try {
			FileInputStream fis = new FileInputStream("myObjects.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Bakery> list = (List<Bakery>) ois.readObject();
			ois.close();
			return list;
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		return null;
	}
}
