package Address_book;
import java.util.*;
public class AddressBook {
	private String addressBookName;
	public AddressBook(String addressBookName) {
		this.addressBookName=addressBookName;
	}
	
	public String getName() {
		return addressBookName;
	}
	
	public void setName(String newAddressBookName) {
		addressBookName=newAddressBookName;
	}
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> contacts= new ArrayList<>();
	public void addContact() {
		System.out.println("Enter details");
		System.out.print("First name: ");
		String name = sc.nextLine();
		System.out.print("Last name: ");
		String lastName = sc.nextLine();
		System.out.print("Address: ");
		String address=sc.nextLine();
		System.out.print("City: ");
		String city=sc.nextLine();
		System.out.print("State: ");
		String state=sc.nextLine();
		System.out.print("Zip: ");
		String zip=sc.nextLine();
		System.out.print("Phone number: ");
		String phone=sc.nextLine();
		System.out.print("Email: ");
		String email=sc.nextLine();
		Contact contact = new Contact(name, lastName, address, city, state, zip, phone, email);
		contacts.add(contact);
	}
	public void editByName(String fullName) {
		boolean found=false;
		for(Contact c:contacts) {
			if(c.getName().equalsIgnoreCase(fullName)) {
				
				System.out.print("Enter the first name: ");
				String firstName=sc.nextLine();
				c.setFirstName(firstName);
				
				System.out.print("Enter the last name: ");
				String lastName=sc.nextLine();
				c.setLastName(lastName);
				
				System.out.print("Enter the address: ");
				String address=sc.nextLine();
				c.setAddress(address);
				
				System.out.print("Enter the city: ");
				String city=sc.nextLine();
				c.setCity(city);
				
				System.out.print("Enter the state: ");
				String state=sc.nextLine();
				c.setState(state);
				
				System.out.print("Enter the zip: ");
				String zip=sc.nextLine();
				c.setZip(zip);
				
				System.out.print("Enter the phoneNumber: ");
				String phoneNumber=sc.nextLine();
				c.setPhoneNumber(phoneNumber);
				
				System.out.print("Enter the email: ");
				String email=sc.nextLine();
				c.setEmail(email);
				
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Name not found !");
		}
	}
	public void deleteByName(String fullName) {
		boolean found=false;
		for(int i=0;i<contacts.size();i++) {
			if(contacts.get(i).getName().equalsIgnoreCase(fullName)) {
				contacts.remove(i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Name not found !");
		}
	}
	
	public void displayContactDetails() {
		for(Contact c: contacts) {
			System.out.println("Details of Contact named "+c.getName()+" :");
			c.displayDetails();
			System.out.println("====================");
		}
	}
	
}

