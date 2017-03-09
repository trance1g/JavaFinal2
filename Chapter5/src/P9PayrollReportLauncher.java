import java.util.Scanner;
import java.text.*;

public class P9PayrollReportLauncher {

	public static void main(String[] args) {


		///instantiating a scanner, DecimalFormat and a TheGreatestAndTheLeast object
		Scanner k = new Scanner(System.in); //used for user input
		P9PayrollReport payroll = new P9PayrollReport(); // //used to store information about the employee
		DecimalFormat f = new DecimalFormat("#0.00"); // used for formatting numbers for currency
				
		String input; // used to gather input from the user
		boolean valid = false; // used for validation
		int end = 1; // used to end the program if set to 0;

		// This is loop covers the over all the input sections
		//because the program is meant to run continuously
		//until the user enters the value of 0 during the first input section
		do{
			//displaying information to the user about the program
			System.out.println("Please, fill in the following fields. No negative values will be accepted. (Enter 0 to terminate the program).");
			//loop for validating for employeeID
			do{
				System.out.println("Enter the employee's ID number. The Id number should be a 3 digits number.");
				input = k.nextLine(); //gather number of years from the user
						
				try {  //tests input to see if it is a positive integer
					int value = Integer.parseInt(input);  
					
					//this is used for testing whether the user entered 0 or not
					//remember if the user enters 0 in this section the program ends 
					if(value == 0){ 
						valid = true;
						end = 0;
					}
					else if(value < 0){
						System.out.println("Negative numbers are not accepted for any of the fields. Please, try again.");
					}else{
						if(value > 99 && value < 1000){
							payroll.setEmployeeID(value);
							valid = true; // makes validation true
						}else{
							System.out.println("That is not a 3 digit number. Please, try again.");
						}
					}
				} catch (NumberFormatException e) {  
					System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
				}
					
			}while(valid == false);
			valid = false; //resets validation
		
			if(end == 1){ // used to test whether to run the rest of the program or not
				do{
					System.out.println("Enter the employee's gross pay.");
					input = k.nextLine(); //gather number of years from the user
						
					try {  //tests input to see if it is a positive integer
						double value = Double.parseDouble(input);  
							
						if(value < 0){
							System.out.println("Negative numbers are not accepted for any of the fields. Please, try again.");
						}else{
							payroll.setGrossPay(value);
							valid = true; // makes validation true	
						}
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
					
				}while(valid == false);
				valid = false; //resets validation
		
				do{
					System.out.println("Enter the state tax.");
					input = k.nextLine(); //gather number of years from the user
						
					try {  //tests input to see if it is a positive integer
						double value = Double.parseDouble(input);  
							
						if(value < 0){
							System.out.println("Negative numbers are not accepted for any of the fields. Please, try again.");
						}else{
							payroll.setStateTax(value);
							valid = true; // makes validation true	
						}
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
					
				}while(valid == false);
				valid = false; //resets validation
		
				do{
					System.out.println("Enter the federal tax.");
					input = k.nextLine(); //gather number of years from the user
						
					try {  //tests input to see if it is a positive integer
						double value = Double.parseDouble(input);  
					
						if(value < 0){
							System.out.println("Negative numbers are not accepted for any of the fields. Please, try again.");
						}else{
						payroll.setFederalTax(value);
						valid = true; // makes validation true	
						}
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
					
				}while(valid == false);
				valid = false; //resets validation
		
				do{
					System.out.println("Enter the FICA withholdings.");
					input = k.nextLine(); //gather number of years from the user
						
					try {  //tests input to see if it is a positive integer
						double value = Double.parseDouble(input);  
							
						if(value < 0){
							System.out.println("Negative numbers are not accepted for any of the fields. Please, try again.");
						}else{
							payroll.setWithholdings(value);
							valid = true; // makes validation true	
						}
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
					
			}while(valid == false);
			valid = false; //resets validation
			
			
			valid = payroll.ValidateTaxes();
			if(valid == false){
				System.out.println("With the information you have entered the total of the state tax, federal tax, and FICA withholdings are greater than the gross pay of the employee.");
				System.out.println("The gross pay must be largeer than the sum of these for the entry to be valid. Please, try again.");
			}else{
				System.out.println("The net pay of employee " + payroll.getEmployeeID() + " for this week is $" + f.format(payroll.NetPay()));
			}
			}
		}while(valid == false);

		k.close();
	}

}
