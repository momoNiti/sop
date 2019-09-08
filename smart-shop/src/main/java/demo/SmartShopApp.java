package demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	User u = User.getInstance();
	@RequestMapping(value = "/set/{firstName}/{lastName}/{phone}", method = RequestMethod.GET)
	public User setUser(@PathVariable String firstName, @PathVariable String lastName, @PathVariable String phone) {
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setPhone(phone);
		return u;
	}
	@RequestMapping("/")
	String home() {
		if(u.getFirstName()==null) {
			if(u.getLastName()==null) {
				if(u.getPhone()==null) {
					return "Please set your name and phone number <----" +
				"/set/{firstName}/{lastName}/{phone}";
				}
			}
		}
		return "Welcome to Bakery Smart Shop :) <br>" 
		+ u.getFirstName() + "  " + u.getLastName() + "  " + u.getPhone() +"<br>" 
		+ "to see all product : /menu <br>"
				+ "to see detail of product : /menu/{ID}   <-- ID of each product <br>"
				+ "to add menu : /add{name}/{flavor}/{price} <-- name - name of product, flavor - flavor of product, price - price of product<br>"
				+ "to delete menu : /delete/{ID} <-- ID of each product";
	}

	@RequestMapping("/menu")
	public ResponseEntity<List<Bakery>> menu(){
//	List<Bakery> menu() {
		return new ResponseEntity<List<Bakery>>(ListBakery.getAllBakery(), HttpStatus.OK);
	}
	@RequestMapping(value = "/menu/{ID}", method = RequestMethod.GET)
	public ResponseEntity<Bakery> menu(@PathVariable int ID) {
		return new ResponseEntity<Bakery>(ListBakery.getBakery(ID), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/add/{name}/{flavor}/{price}", method = RequestMethod.GET)
	public ResponseEntity<List<Bakery>> add(@PathVariable String name, @PathVariable String flavor, @PathVariable float price) {
		return new ResponseEntity<List<Bakery>>(ListBakery.addBakery(name, flavor, price), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete/{ID}", method = RequestMethod.DELETE)
	public ResponseEntity<List<Bakery>> delete(@PathVariable int ID){
		return new ResponseEntity<List<Bakery>>(ListBakery.deleteIdBakery(ID), HttpStatus.OK);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SmartShopApp.class, args);
//		User u = User.getInstance();
////		initial
//		u.setFirstName("Niti");
//		u.setLastName("Jirakarnwuttikrai");
//		u.setPhone("0617689874");
////		print check
//		System.out.println(u.getFirstName());
//		System.out.println(u.getLastName());
//		System.out.println(u.getPhone());
////		check instance 
//		User a = User.getInstance();
//		System.out.println(a.getFirstName());
		
	}
}
