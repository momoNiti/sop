package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HelloWorld {
	@RequestMapping("/")
	String home() {
		return "Hello M world!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorld.class, args);

	}

}
