package demo;

/**
 * @author Niti-Jira
 *
 */
public class Run {

	public static void main(String[] args) {
		Icecream a = IcecreamFactory.createIcecream("Hello");
		Icecream b = IcecreamFactory.createIcecream("Vanilla");
		Icecream c = IcecreamFactory.createIcecream("Chocolate");
		System.out.println(a);
		System.out.println(b.getFlavor());
		System.out.println(c.getFlavor());
	}

}
