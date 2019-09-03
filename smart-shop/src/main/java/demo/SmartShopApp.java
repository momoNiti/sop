package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	Bakery[] home() {
		return ListBakery.getAllBakery(); 
	}
	
	@RequestMapping("/menu")
	
	Bakery menu(@RequestParam int ID) {
		return ListBakery.getBakery(ID);
	}
	public static void main(String[] args) {
		SpringApplication.run(SmartShopApp.class, args);
	}

}
