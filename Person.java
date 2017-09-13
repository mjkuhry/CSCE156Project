package cineclarkEntCenter;

public class Person {
	
	public String personCode;
	protected String lastName;
	protected String firstName;
	protected String streetAddress;
	protected String city;
	protected String state;
	protected int zipCode;
	protected String country;
	protected String[] emailAddress;
	
	 
	public void Person(String personCode,String last, String first, String streetAddress, 
String city, String state, int zipCode, String country, String[] emailAddress){
		personCode = this.personCode;
		last = this.lastName;
		first = this.firstName;
		streetAddress = this.streetAddress;
		city = this.city;
		state = this.state;
		zipCode = this.zipCode;
		country = this.country;
		emailAddress = this.emailAddress;
 }


	public String getPersonCode() {
		return personCode;
	}


	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	public String[] getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String[] emailAddress) {
		this.emailAddress = emailAddress;
	}

}
//personCode – a unique	alpha-numeric	designation from	the	old	system
//o name – the	person’s	name	in	separated	by	a	comma	(“,”)	in	“last-name,	first-name”	
//format.	(E.g		“Watson,	Dave”)
//o address – the	mailing	address	of	the	person	with	individual	fields	separated	by	commas
//(“,”).	The	format	is	as	follows:	“STREET,CITY,STATE,ZIP,COUNTRY”
//o emailaddress(es) – an	(optional)	list	of	email	addresses;	if	there	are	multiple	email	
//addresses,	they	will	be	delimited	by	a	comma(“,”).*\