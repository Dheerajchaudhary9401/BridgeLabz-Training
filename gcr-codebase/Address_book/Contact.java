package Address_book;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	public Contact(String firstName,String lastName,String address,String city, String state,String zip,String phone,String email) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone=phone;
		this.email=email;
	}
	
	public String getName(){
		return firstName+lastName;
	}
	public String getaddress(){
		return address+city+state+zip;
	}
	public String getphone(){
		return phone;
	}
	public String getEmail() {
		return email;
	}

	public void setFirstName(String newFirstName) {
		firstName=newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName=newLastName;
	}
	
	public void setAddress(String newAddress) {
		address=newAddress;
	}
	
	public void setCity(String newCity) {
		city=newCity;
	}
	
	public void setState(String newState) {
		state=newState;
	}
	
	public void setZip(String newZip) {
		zip=newZip;
	}
	
	public void setPhoneNumber(String newPhoneNumber) {
		phone=newPhoneNumber;
	}
	
	public void setEmail(String newEmail) {
		email=newEmail;
	}
	public void displayDetails() {
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip Code: "+zip);
		System.out.println("Phone Number: "+phone);
		System.out.println("Email: "+email);
	}
}
