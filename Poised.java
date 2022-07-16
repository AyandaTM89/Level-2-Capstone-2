// import packages
import java.io.PrintStream;
import java.util.Scanner;

// defining main class
public class Poised {

	private static final PrintStream OUT = System.out;
	private static int option;

	// defining main method
	public static void main(String[] args) throws Exception {
		//try catch block 
	try (
		Scanner input = new Scanner(System.in)) {
			//try catch block
			try 
			{
				// menu options for the user to select from
				OUT.println("--MENU--\n");
				OUT.println("1. Add NEW PROJECT");
				OUT.println("2. Add ARCHITECT");
				OUT.println("3. Add CONTRACTOR");
				OUT.println("4. FINALISE PROJECT ");
				OUT.println("5. EDIT");
				OUT.println("0. EXIT");
				OUT.println("Enter choice between(0 - 5):");
				option = input.nextInt();
				
				// if user selects 1 they will have to fill in New project details
				if (option == 1){
					OUT.println("NEW PROJECT FORM \n");
					
					//New Project details
					// data types and all the attributes
					OUT.println("Enter Project ID: ");
					input.nextInt();
					 
					OUT.println("Enter Project Name: ");
					input.nextLine();
					
					OUT.println("Enter Building Type: ");
					input.nextLine();
					
					OUT.println("Enter Project Address: ");
					input.next();
					
					OUT.println("Enter ERF Number: ");
					input.nextDouble();
					
					OUT.println("Enter Fee Charged: ");
					input.nextDouble();
					
					OUT.println("Enter Amount Paid: ");
					input.nextDouble();
					
					OUT.println("Enter DeadLine Date: ");
					input.nextLine();

					//Architect details
					OUT.println("Enter Architect Name: ");
					String ArchitectName = input.nextLine();
					OUT.println("Enter Architect Cell Number: ");
					int ArchitectNumber = input.nextInt();
					OUT.println("Enter Architect Email Address: ");
					String ArchitectEmail = input.nextLine();
					OUT.println("Enter Architect Physical Address: ");
					String ArchitectAddress = input.nextLine();

					//Contractor details
					OUT.println("Enter Contractor ID: ");
					int ContractorID = input.nextInt();
					OUT.println("Enter Contractor Name: ");
					String ContractorName = input.nextLine();
					OUT.println("Enter Contractor Cell Number: ");
					int ContractorNumber = input.nextInt();
					OUT.println("Enter Contractor Email: ");
					String ContyractorEmail = input.nextLine();
					OUT.println("Enter Contractor Physical Address: ");
					String ContractorAddress = input.nextLine();

					//Customer Details
					OUT.println("Enter Customer ID: ");
					int CustomerID = input.nextInt();
					OUT.println("Enter Customer Name: ");
					String CustomerName = input.nextLine();
					OUT.println("Enter Customer Cell Number: ");
					int CustomerNumber = input.nextInt();
					OUT.println("Enter Customer Email: ");
					String CustomerEmail = input.nextLine();
					OUT.println("Enter Customer Physical Address: ");
					String CustomerAddress = input.nextLine();
					
					new Architect(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
					new Contractor(ContractorID, ContractorName, ContractorNumber, ContyractorEmail, ContractorAddress);
					new Customer(CustomerID,CustomerName, CustomerNumber, CustomerEmail, CustomerAddress);
				
						
				}
				
				else if(option == 2) {
					//Architect details
					OUT.println("ARCHITECT DETAILS \n");
					OUT.println("Enter Architect Name: ");
					String ArchitectName = input.nextLine();
					
					OUT.println("Enter Architect Cell Number: ");
					int ArchitectNumber = input.nextInt();
					
					OUT.println("Enter Architect Email Address: ");
					String ArchitectEmail = input.nextLine();
					
					OUT.println("Enter Architect Physical Address: ");
					String ArchitectAddress = input.nextLine();
					
					new Architect(ArchitectName, ArchitectNumber, ArchitectEmail, ArchitectAddress);
				}
				
				
				else if(option == 3) {
					
					OUT.println("CONTRACTOR DETAILS \n");
					//Contractor details
					OUT.println("Enter Contractor ID: ");
					int ContractorID = input.nextInt();
					OUT.println("Enter Contractor Name: ");
					String ContractorName = input.nextLine();
					OUT.println("Enter Contractor Cell Number: ");
					int ContractorNumber = input.nextInt();
					OUT.println("Enter Contractor Email: ");
					String ContyractorEmail = input.nextLine();
					OUT.println("Enter Contractor Physical Address: ");
					String ContractorAddress = input.nextLine();
					
					new Contractor(ContractorID, ContractorName, ContractorNumber, ContyractorEmail, ContractorAddress);
					
				}
				
				else if(option == 4) {
					OUT.println("Enter a Project Number to Finalise: ");
					input.nextInt();
					return;
					}
			
				else if (option == 5) {
					// Editing Menu
					OUT.println("--EDITING OPTIONS--\n");
					OUT.println("1. CHANGE AMOUNT OF FEE PAID");
					OUT.println("2. CHANGE CONTRACTOR CONTACTS");
					OUT.println("3. CHANGE DUE DATE OF PROJECT");
					OUT.println("0. BACK");
					OUT.println("Enter Options between(0 - 3):");
					int options = input.nextInt();
					
						if (options == 1) {
							
							OUT.println("Please enter the new amout: ");
							input.nextDouble();
						}
						else if(options == 2) {
							
							OUT.println("Please enter new contrctors contacts");
							input.nextInt();
						}
						else if (options == 3) {
							OUT.println("Enter DeadLine Date: ");
							input.nextLine();
						}
						else if (options == 0) {
							System.exit(options);
						}
					
				}
				
				else if (option == 0) {
					System.exit(option);
				}
				
			}

			// catch block to catch wrong user input
			 catch (Exception e)
			{
			    OUT.println("invalid user input");
			}
		}
		// catch block to catch any exception that happensd in program with variable e
		 catch (Exception e)
		{
		    OUT.println(e);
		}
		
	}

}
