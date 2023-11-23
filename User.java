package application;

public class User {
	// Declare user variables
	public String firstName;
	public String lastName;
	public String phone;
	public String email;
	public String password;
	public PermissionEnum permission;
	
	// Constructor
	public User(String firstName, String lastName, String phone, String email, String password, PermissionEnum permission) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.permission = permission;
	}
	
	// Getter for firstName
	public String getFirstName() {
		return firstName;
	}
	
	// Setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Getter for lastName
	public String getLastName() {
		return lastName;
	}
	
	// Setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Getter for phone
	public String getPhone() {
		return phone;
	}
	
	// Setter for phone
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Getter for email
	public String getEmail() {
		return email;
	}
	
	// Setter for email
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getter for password
	public String getPassword() {
		return password;
	}
	
	// Setter for password
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Getter for permission
	public String getPermission() {
		return permission.toString();
	}
	
	// Setter for permission
	public void setPermission(PermissionEnum permission) {
		this.permission = permission;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.phone + " " + this.email + " " + this.password + " " + this.permission;
	}
	
}
