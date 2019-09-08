package demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Niti-Jira
 *
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SmartShopApp {
	@RequestMapping("/")
	String home() {
		return "Welcome to Bakery Smart Shop :) <br>" + "to see all product : /menu <br>"
				+ "to see detail of product : /menu/{ID}   <-- ID of each product <br>"
				+ "to add menu : /add{name}/{flavor}/{price} <-- name - name of product, flavor - flavor of product, price - price of product<br>"
				+ "to delete menu : /delete/{ID} <-- ID of each product";
	}

	@RequestMapping("/menu")
	List<Bakery> menu() {
		return ListBakery.getAllBakery();
	}

	@RequestMapping(value = "/menu/{ID}", method = RequestMethod.GET)
	Bakery menu(@PathVariable int ID) {
		return ListBakery.getBakery(ID);
	}
	
	@RequestMapping(value = "/add/{name}/{flavor}/{price}", method = RequestMethod.GET)
	 List<Bakery> add(@PathVariable String name, @PathVariable String flavor, @PathVariable float price) {
		return ListBakery.addBakery(name, flavor, price);
	}
	
	@RequestMapping(value = "/delete/{ID}", method = RequestMethod.GET)
	List<Bakery> delete(@PathVariable int ID){
		return ListBakery.deleteIdBakery(ID);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SmartShopApp.class, args);
		User u = User.getInstance();
//		initial
		u.setFirstName("Niti");
		u.setLastName("Jirakarnwuttikrai");
		u.setPhone("0617689874");
//		print check
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		System.out.println(u.getPhone());
//		check instance 
		User a = User.getInstance();
		System.out.println(a.getFirstName());
		
	}
}
