package demo;

public class User {
	private String firstName;
	private String lastName;
	private String phone;
	private static User instance;
	
	private User() {
	}
	
	public static User getInstance() {
		if (instance==null) {
			instance =  new User();
		}
		return instance;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
