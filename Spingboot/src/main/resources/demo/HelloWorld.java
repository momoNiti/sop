@SpringBootApplication
@RestController
@RequestMapping(value = "hello")
public class HelloWorld {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);

	}

	@RequestMapping(value="/{firstName}/{lastName}”
			, method = RequestMethod.GET)

			public String hello(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
			return String.format("{\"message\":\"Hello %s %s\"}", firstName,
			lastName);

			}

}
