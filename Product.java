package cineclarkEntCenter;

public class Product {
	protected String productCode;
	protected char productType;
	protected String dateTime;
	protected String startDate;
	protected String endDate;
	protected String name;
	protected String streetAddress;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;
	protected int ScreanNum;
	protected double price;
	
	public void movieTicket(String productCode, char productType, String dateTime, 
			String movieName, String streetAddress, String city, String state, int zip,
			String country, int ScreanNum){
		productCode = this.productCode;
		productType = 'M';
		dateTime = this.dateTime;
		movieName = this.name;
		streetAddress = this.streetAddress;
		city = this.city;
		state = this.state;
		zip = this.zip;
		country = this.country;
		ScreanNum = this.ScreanNum;

	}
	public void seasonPass(String productCode, char productType, String name, String startDate,
			String endDate, double price){
		productCode = this.productCode;
		productType = 'S';
		name = this.name;
		startDate = this.startDate;
		endDate = this.endDate;
		price = this.price;
	}
	
	public void parkingPass(String productCode, char productType, double price){
		productCode = this.productCode;
		productType = 'P';
		price = this.price;
	}
	
	public void refreshment(String productCode, char productType, String name, Double price){
		productCode = this.productCode;
		productType = 'R';
		name = this.name;
		price = this.price;
	}
}