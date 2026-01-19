package Address_book;

public class Main {

	public static void main(String[] args) {
		AddressBookManager manager=new AddressBookManager();
		manager.addAddressBook("Friends");
		
		AddressBook book=manager.getAddressBook("Friends");
		book.addContact();
		book.addContact();
		
		manager.editAddressBookName("enemies", "friends");
		book.editByName("dheeraj");
		
		manager.displayAddressBookDetails();
		
		book.deleteByName("vikash");
		manager.displayAddressBookDetails();
	}

}
