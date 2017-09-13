package cineclarkEntCenter;
	
public class Customer extends Person {
	private char type;
	private String primaryContact;
	
	public void Customer(String customerCode, char type, String primaryContact, 
			String lastName, String firstName, String address, String city, 
			String state, int zipCode, String country){
		customerCode = this.personCode;
		type = this.type;
		primaryContact = this.primaryContact;
		lastName = this.lastName;
		firstName = this.firstName;
		address = this.streetAddress;
		city = this.city;
		state = this.state;
		zipCode = this.zipCode;
		country = this.country;
		
		
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	
}
