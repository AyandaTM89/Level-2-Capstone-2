// customer class
public class Customer {
	// defining the variables and data types
	private int CustomerID;
	private String CustomerName;
	private int CustomerNumber;
	private String CustomerEmail;
	private String CustomerAddress;
	
	// attributes of Customer class
	public Customer(int CustomerID, String CustomerName, int CustomerNumber, String CustomerEmail, String CustomerAddress){
		
		this.CustomerID = CustomerID;
		this.CustomerName = CustomerName;
		this.CustomerNumber = CustomerNumber;
		this.CustomerEmail = CustomerEmail;
		this.CustomerAddress = CustomerAddress;
		}
			//toString methods to display values 
		public String toString(String ArchitectEmail) {
		String output = "Customer Name: " + CustomerName;
		output += "\nCell Number:" + CustomerNumber;
		output += "\nCustomer ID:  " + CustomerID;
		output += "\nCustomer Address: " + CustomerAddress;
		return output;
		
		}
	
}
