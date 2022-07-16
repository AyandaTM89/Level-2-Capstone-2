// defining class Contractor
public class Contractor {
	// defining the variables and data types
	int ContractorID;
	String ContractortName;
	int ContractorNumber;
	String ContractorEmail;
	String ContractorAddress;
	
	// Contractor constructor and the attributes
	public Contractor(int ContractorID, String ContractortName, int ContractorNumber, String ContractortEmail, String ContractortAddress){
		
	this.ContractorID = ContractorID;
	this.ContractortName = ContractortName;
	this.ContractorNumber = ContractorNumber;
	this.ContractorAddress = ContractorAddress;
	}
		//toString methods to display values 
	public String toString(String ArchitectEmail) {
	String output = extracted();
	return output;
	
	}
	protected String extracted() {
		String output = "Contractor Name: " + ContractortName;
		output += "\nCell Number:" + ContractorNumber;
		output += "\nContractor ID:  " + ContractorID;
		output += "\nAddress: " + ContractorAddress;
		return output;
	}

}
