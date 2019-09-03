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
public class Run {
	@RequestMapping("/")
	String home() {
		return "Hello M world!";
	}
	
	@RequestMapping("/menu")
	String menu(@RequestParam String name, @RequestParam float price) {
//		return ShopFactory.getMenuCategory(name).getMenuDetail();
		return ShopFactory.createChocolateBakery(name, price).getFlavor();
	}
	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}

}
