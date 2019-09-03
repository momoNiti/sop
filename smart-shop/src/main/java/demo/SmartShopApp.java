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
	String home() {
		return "Hello M world!";
	}
	
	@RequestMapping("/menu")
	String menu(@RequestParam String flavor) {
		return ShopFactory.getBakery(flavor).getFlavor();
	}
	public static void main(String[] args) {
		SpringApplication.run(SmartShopApp.class, args);
	}

}
