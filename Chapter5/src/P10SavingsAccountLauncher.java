import java.text.DecimalFormat;
import java.util.Scanner;

public class P10SavingsAccountLauncher {

	public static void main(String[] args) {


		///instantiating a scanner, DecimalFormat and a SavingsAccount object
				Scanner k = new Scanner(System.in); //used for user input
				
				DecimalFormat f = new DecimalFormat("#0.00"); // used for formatting numbers for currency
				P10SavingsAccount savings = new P10SavingsAccount();		
				String input; // used to gather input from the user
				boolean valid = false; // used for validation

				
	
				//displaying information to the user about the program
				System.out.println("Please, fill in the following fields.");
				//loop for validating for account's balance
				do{
					System.out.println("Enter the starting balance in the account.");
					input = k.nextLine(); //gather number of years from the user
							
					try {  //tests input to see if it is a positive integer
						double value = Double.parseDouble(input);  
						savings.setBalance(value);
						valid = true;
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
						
				}while(valid == false);
				valid = false; //resets validation
				
				
				//loop for validating for annual interest rate
				do{
					System.out.println("Enter the annual interest for the account.");
					input = k.nextLine(); //gather number of years from the user
							
					try {  //tests input to see if it is a positive integer
						double value = Double.parseDouble(input);  
						savings.setAnnualInterestRate(value);
						valid = true;
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
						
				}while(valid == false);
				valid = false; //resets validation
				
				
				//loop for validating for months
				do{
					System.out.println("Enter the months since this account has been established.");
					input = k.nextLine(); //gather number of years from the user
							
					try {  //tests input to see if it is a positive integer
						int value = Integer.parseInt(input);  
						savings.setMonths(value);
						valid = true;
					} catch (NumberFormatException e) {  
						System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
					}
						
				}while(valid == false);
				valid = false; //resets validation
				
				for(int x = 1; x <= savings.getMonths(); x++){
					//loop for validating for deposits
					do{
						System.out.println("Enter the amount that you deposited this month. The amount cannot be negative.");
						input = k.nextLine(); //gather number of years from the user
								
						try {  //tests input to see if it is a positive integer
							double value = Double.parseDouble(input);
							
							if(value >= 0){ //tests if value is negative or not
								savings.Deposit(value);
								valid = true;
							}else{
								System.out.println("Deposit value cannot be negative. Please, try again.");
							}
						} catch (NumberFormatException e) {  
							System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
						}
							
					}while(valid == false);
					valid = false; //resets validation	
					
					//loop for validating for withdrawals
					do{
						System.out.println("Enter the amount that you withdrew this month. The amount cannot be negative.");
						input = k.nextLine(); //gather number of years from the user
								
						try {  //tests input to see if it is a positive integer
							double value = Double.parseDouble(input);
							
							if(value >= 0){ //tests if value is negative or not
								savings.Withdrawal(value);
								valid = true;
							}else{
								System.out.println("Deposit value cannot be negative. Please, try again.");
							}
						} catch (NumberFormatException e) {  
							System.out.println("Invalid entry. Please, try again."); //displays error if input it's an integer value
						}
							
					}while(valid == false);
					valid = false; //resets validation
					
					savings.MonthlyInterestRate(); //calculate the monthly interest rate
					
					System.out.println("The balance for this month is $" + f.format(savings.getBalance())); //display balance at the end of the month
					
				}
				
				System.out.println("The final balance on the account is $" + f.format(savings.getBalance()));
				System.out.println("The total deposits made was $" + f.format(savings.getDeposits()));
				System.out.println("The total withdrawals made was $" + f.format(savings.getWithdrawals()));
				}

	}
